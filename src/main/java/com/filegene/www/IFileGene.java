/*
 * FileGene
 */
package com.filegene.www;

import com.filegene.www.lib.FileGeneEntity;

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
    FileGeneEntity[] getGene();

    /**
     * get encode settings for {@link InputStreamReader} to open the file
     * @return encode
     */
    String getEncode();
}
