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
 * JPGFileGeneTest
 * @author uguisu
 */
public class JPGFileGeneTest {

    @Test
    public void test001() {
        String file = HeaderGeneCheckerTest.class.getClassLoader().getResource("cat.jpeg").getFile();
        IChecker fileGeneChecker = new HeaderGeneChecker(new JPGFileGene());
        assertTrue(fileGeneChecker.isExpect(new File(file)));
    }
    @Test
    public void test002() {
        String file = HeaderGeneCheckerTest.class.getClassLoader().getResource("hello.zip").getFile();
        IChecker fileGeneChecker = new HeaderGeneChecker(new JPGFileGene());
        assertFalse(fileGeneChecker.isExpect(new File(file)));
    }
}
