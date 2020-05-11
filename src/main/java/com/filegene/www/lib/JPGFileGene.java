/*
 * FileGene
 */
package com.filegene.www.lib;

import com.filegene.www.AbstractFileGene;

/**
 * JPEG FileGene
 * @author uguisu
 */
public class JPGFileGene extends AbstractFileGene {

    public final static FileGeneEntity[] GENE_LIST = {
            new FileGeneEntity("JPEG", "(FFD8FFE0)[0-9A-F]{4}(4A46494600)", 11,
                    "Standard JPEG/JFIF file"),
            new FileGeneEntity("JPEG", "(FFD8FFE1)[0-9A-F]{4}(4578696600)", 11,
                    "Standard JPEG file with Exif metadata"),
            new FileGeneEntity("JPEG", "(FFD8FFE2)", 4,
                    "Canon Camera Image File Format"),
            new FileGeneEntity("JPEG", "(FFD8FFE8)[0-9A-F]{4}(535049464600)", 11,
                    "Still Picture Interchange File Format"),
    };

    public final static String READER_ENCODER = "ISO8859_1";

    public JPGFileGene() {
        super(GENE_LIST, READER_ENCODER);
    }
}
