/*
 * FileGene
 */
package com.filegene.www.lib;

import com.filegene.www.AbstractFileGene;

/**
 * Microsoft Office Open XML Format (OOXML) Document FileGene
 * @author uguisu
 */
public class OOXmlExcelGene extends AbstractFileGene {

    public final static FileGeneEntity[] GENE_LIST = {
            new FileGeneEntity("XLSX", "(504B030414000600)", 8,
                    "Excel"),
    };

    public final static FileGeneEntity[] ADDITIONAL_GENE_LIST = {
            new FileGeneEntity("XLSX", "(2F776F726B626F6F6B2E786D6C)", -1,
                    "Excel")
    };

    public final static String READER_ENCODER = "ISO8859_1";

    public OOXmlExcelGene() {
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
