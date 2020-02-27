/*
 * FileGene
 */
package com.filegene.www.checker;

import javax.validation.constraints.NotNull;
import java.io.File;

/**
 * IChecker
 * @author uguisu
 */
public interface IChecker {

    /**
     * verify the input file match specific gene
     * @param file
     * @return
     */
    boolean isExpect(@NotNull File file);
}
