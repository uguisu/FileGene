/*
 * FileGene
 */
package com.filegene.www;

/**
 * AbstractFileGene
 * @author uguisu
 */
public abstract class AbstractFileGene implements IFileGene {

    protected final String[] gene;
    protected final String encode;

    public AbstractFileGene(String[] gene, String encode) {
        this.gene = gene;
        this.encode = encode;
    }

    /**
     * {@inheritDoc}
     */
    public String[] getGene() {
        return this.gene;
    }
    /**
     * {@inheritDoc}
     */
    public String getEncode() {
        return this.encode;
    }
}
