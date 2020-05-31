/*
 * FileGene
 */
package com.filegene.www.lib;

import com.filegene.www.AbstractFileGene;

/**
 * Microsoft Office Open XML Format (OOXML) Document FileGene
 * @author uguisu
 */
public class OOXmlPowerPointGene extends AbstractFileGene {

    public final static FileGeneEntity[] GENE_LIST = {
            new FileGeneEntity("PPTX", "(504B030414000600)", 8,
                    "PowerPoint")
    };

    public final static FileGeneEntity[] ADDITIONAL_GENE_LIST = {
            new FileGeneEntity("PPTX", "(7070742F7669657750726F70732E786D6C)", -1,
                    "PowerPoint")
    };

    public final static String READER_ENCODER = "ISO8859_1";

    public OOXmlPowerPointGene() {
        super(GENE_LIST, READER_ENCODER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileGeneEntity[] haveAdditionalGenes() {
        return ADDITIONAL_GENE_LIST;
    }
}
