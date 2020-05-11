/*
 * FileGene
 */
package com.filegene.www.lib;

import com.filegene.www.AbstractFileGene;

/**
 * Bmp FileGene
 * @author uguisu
 */
public class BmpFileGene extends AbstractFileGene {

    public final static FileGeneEntity[] GENE_LIST = {
            new FileGeneEntity("BMP", "(424D)", 2,
                    "Windows (or device-independent) bitmap image")
    };

    public final static String READER_ENCODER = "ISO8859_1";

    public BmpFileGene() {
        super(GENE_LIST, READER_ENCODER);
    }
}
