/*
 * FileGene
 */
package com.filegene.www.lib;

import com.filegene.www.AbstractFileGene;

/**
 * PNG FileGene
 * @author uguisu
 */
public class PNGFileGene extends AbstractFileGene {

    public final static FileGeneEntity[] GENE_LIST = {
            new FileGeneEntity("PNG", "(89504E470D0A1A0A)", 8,
                    "A PNG file is an image file stored in the Portable Network Graphic (PNG) format.")
    };

    public final static String READER_ENCODER = "ISO8859_1";

    public PNGFileGene() {
        super(GENE_LIST, READER_ENCODER);
    }
}
