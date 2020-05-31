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
 * OOXmlPowerPointGeneTest
 * @author uguisu
 */
public class OOXmlPowerPointGeneTest {

    @Test
    public void test001() {
        String file = HeaderGeneCheckerTest.class.getClassLoader().getResource("v2016.pptx").getFile();
        IChecker fileGeneChecker = new HeaderGeneChecker(new OOXmlPowerPointGene());
        assertTrue(fileGeneChecker.isExpect(new File(file)));
    }

    @Test
    public void test002() {
        String file = HeaderGeneCheckerTest.class.getClassLoader().getResource("v2016.docx").getFile();
        IChecker fileGeneChecker = new HeaderGeneChecker(new OOXmlPowerPointGene());
        assertFalse(fileGeneChecker.isExpect(new File(file)));
    }
}
