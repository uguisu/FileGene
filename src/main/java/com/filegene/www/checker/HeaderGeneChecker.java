/*
 * FileGene
 */
package com.filegene.www.checker;

import com.filegene.www.AbstractFileGene;
import com.filegene.www.lib.FileGeneEntity;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * HeaderGeneChecker
 *
 * Will load a specific length of file header and then calculate these bytes into HEX.
 * If calculate result equals the gene, then return true, otherwise return fails
 *
 * @author uguisu
 */
public class HeaderGeneChecker implements IChecker {

    /** gene declaration */
    private final AbstractFileGene fileGene;

    public HeaderGeneChecker(AbstractFileGene fileGene) {
        this.fileGene = fileGene;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isExpect(@NotNull File file) {

        boolean rtn = false;

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            // open file as binary stream
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, this.fileGene.getEncode());

            rtn = isFindTargetGene(inputStreamReader, this.fileGene.getGene());

            if(null != this.fileGene.haveAdditionalGenes()) {
                inputStreamReader = new InputStreamReader(fileInputStream, this.fileGene.getEncode());
                rtn = isFindTargetGene(inputStreamReader, this.fileGene.haveAdditionalGenes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return rtn;
    }

    /**
     * isFindTargetGene
     * @param inputStreamReader {@link InputStreamReader}
     * @param genes gene list
     * @return true - find
     * @throws IOException IO error
     */
    private boolean isFindTargetGene(final InputStreamReader inputStreamReader, final FileGeneEntity[] genes)
            throws IOException {

        for(FileGeneEntity fg : genes) {
            int wRead = 0;
            // cache read header
            StringBuilder targetFileGeneCollector = new StringBuilder();

            if(fg.getGeneLength() > 0) {
                // declared gene length

                for (int headerIdx = fg.getGeneLength(); headerIdx > 0; headerIdx--) {
                    wRead = inputStreamReader.read();

                    if (-1 == wRead)
                        // meet the EOF
                        break;

                    // collect
                    targetFileGeneCollector.append(String.format("%02X", (int) wRead & 0xff));
                }
            } else {
                // length unknown, read file to the EOF
                while (true) {
                    wRead = inputStreamReader.read();

                    if (-1 == wRead)
                        // meet the EOF
                        break;

                    // collect
                    targetFileGeneCollector.append(String.format("%02X", (int) wRead & 0xff));
                }
            }

            Pattern p = Pattern.compile(fg.getGeneRegex());

            if(p.matcher(targetFileGeneCollector.toString()).find())
                return true;
        }

        return false;
    }
}