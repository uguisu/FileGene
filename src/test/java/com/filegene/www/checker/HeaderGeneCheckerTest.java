/*
 * FileGene
 */
package com.filegene.www.checker;

import com.filegene.www.lib.PNGFileGene;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * HeaderGeneCheckerTest
 * @author uguisu
 */
public class HeaderGeneCheckerTest {

    @Test
    public void test001() {
        String file = HeaderGeneCheckerTest.class.getClassLoader().getResource("postman-icon.png").getFile();
        IChecker fileGeneChecker = new HeaderGeneChecker(new PNGFileGene());
        assertTrue(fileGeneChecker.isExpect(new File(file)));
    }
    @Test
    public void test002() {
        String file = HeaderGeneCheckerTest.class.getClassLoader().getResource("hello.zip").getFile();
        IChecker fileGeneChecker = new HeaderGeneChecker(new PNGFileGene());
        assertFalse(fileGeneChecker.isExpect(new File(file)));
    }
}
