/*
 * FileGene
 */
package com.filegene.www.lib;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FileGeneEntity
 * @author uguisu
 */
@Data
@AllArgsConstructor
public class FileGeneEntity {

    private String name;
    private String geneRegex;
    private int geneLength = 0;
    private String description = "";

    @Override
    public String toString() {
        return String.format("name: %s\ngeneRegex: %s\ngeneLength: %d\ndescription: %s", name, geneRegex, geneLength,
                description);
    }

    @Override
    public int hashCode() {
        return name.concat(geneRegex).concat(description).hashCode() + geneLength;
    }
}
