/*
 * FileGene
 */
package com.filegene.www.checker;

import com.filegene.www.AbstractFileGene;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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

            int wRead = 0;
            // calculate header, HeaderGeneChecker will only check file header
            int headerLength = this.fileGene.getGene()[0].length() / 2;
            // cache read header
            StringBuilder targetFileGeneCollector = new StringBuilder();

            for (int headerIdx = headerLength; headerIdx > 0; headerIdx--) {
                wRead = inputStreamReader.read();

                if (-1 == wRead)
                    // meet the EOF
                    break;

                // collect
                targetFileGeneCollector.append(String.format("%02X", (int) wRead & 0xff));
            }

            rtn = this.fileGene.getGene()[0].equals(targetFileGeneCollector.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rtn;
    }
}