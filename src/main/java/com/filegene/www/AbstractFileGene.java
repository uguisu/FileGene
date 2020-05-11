/*
 * FileGene
 */
package com.filegene.www;

import com.filegene.www.lib.FileGeneEntity;

/**
 * AbstractFileGene
 * @author uguisu
 */
public abstract class AbstractFileGene implements IFileGene {

    protected final FileGeneEntity[] gene;
    protected final String encode;

    public AbstractFileGene(FileGeneEntity[] gene, String encode) {
        this.gene = gene;
        this.encode = encode;
    }

    /**
     * {@inheritDoc}
     */
    public FileGeneEntity[] getGene() {
        return this.gene;
    }
    /**
     * {@inheritDoc}
     */
    public String getEncode() {
        return this.encode;
    }
}
