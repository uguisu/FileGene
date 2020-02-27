/*
 * FileGene
 */
package com.filegene.www;

import java.io.InputStreamReader;

/**
 * IFileGene
 * @author uguisu
 */
public interface IFileGene {

    /**
     * get gene as string array
     * @return gene array
     */
    String[] getGene();

    /**
     * get encode settings for {@link InputStreamReader} to open the file
     * @return encode
     */
    String getEncode();

    /**
     * get description current file type
     * @return description
     */
    String getDescription();
}
