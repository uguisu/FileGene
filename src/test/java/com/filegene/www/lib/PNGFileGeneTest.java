/*
 * FileGene
 */
package com.filegene.www.lib;

import com.filegene.www.checker.HeaderGeneChecker;
import com.filegene.www.checker.HeaderGeneCheckerTest;
import com.filegene.www.checker.IChecker;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * PNGFileGeneTest
 * @author uguisu
 */
public class PNGFileGeneTest {

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
