/*
 * FileGene
 */
package com.filegene.www.lib;

import com.filegene.www.AbstractFileGene;

/**
 * Microsoft Office Open XML Format (OOXML) Document FileGene
 * @author uguisu
 */
public class OOXmlWordGene extends AbstractFileGene {

    public final static FileGeneEntity[] GENE_LIST = {
            new FileGeneEntity("DOCX", "(504B030414000600)", 8,
                    "Word")
    };

    public final static FileGeneEntity[] ADDITIONAL_GENE_LIST = {
            new FileGeneEntity("DOCX", "(776F72642F646F63756D656E742E786D6C)", -1,
                    "Word")
    };

    public final static String READER_ENCODER = "ISO8859_1";

    public OOXmlWordGene() {
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
