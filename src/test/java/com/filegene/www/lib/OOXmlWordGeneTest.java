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
 * OOXmlWordGeneTest
 * @author uguisu
 */
public class OOXmlWordGeneTest {

    @Test
    public void test001() {
        String file = HeaderGeneCheckerTest.class.getClassLoader().getResource("v2016.docx").getFile();
        IChecker fileGeneChecker = new HeaderGeneChecker(new OOXmlWordGene());
        assertTrue(fileGeneChecker.isExpect(new File(file)));
    }

    @Test
    public void test002() {
        String file = HeaderGeneCheckerTest.class.getClassLoader().getResource("v2016.xlsx").getFile();
        IChecker fileGeneChecker = new HeaderGeneChecker(new OOXmlWordGene());
        assertFalse(fileGeneChecker.isExpect(new File(file)));
    }

}
