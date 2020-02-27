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

    public final static String[] GENE_LIST = { "89504E470D0A1A0A" };
    public final static String READER_ENCODER = "ISO8859_1";

    public PNGFileGene() {
        super(GENE_LIST, READER_ENCODER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return "A PNG file is an image file stored in the Portable Network Graphic (PNG) format. " +
                "It contains a bitmap of indexed colors and uses lossless compression, similar to a" +
                " .GIF file but without copyright limitations. PNG files are commonly used to store " +
                "graphics for web images.";
    }
}
