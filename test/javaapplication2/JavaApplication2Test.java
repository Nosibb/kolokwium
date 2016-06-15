/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author informatyka1
 */
public class JavaApplication2Test {
    
    public JavaApplication2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class JavaApplication2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaApplication2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NajwiekszaLiczba method, of class JavaApplication2.
     */
    @Test
    public void testNajwiekszaLiczba() {
        System.out.println("NajwiekszaLiczba");
        int[] tablica = {-3,1,2,-2,5,6};
        int expResult = 6;
        int result = JavaApplication2.NajwiekszaLiczba(tablica);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DrugaNajwiekszaLiczba method, of class JavaApplication2.
     */
    @Test
    public void testDrugaNajwiekszaLiczba() {
        System.out.println("DrugaNajwiekszaLiczba");
        int[] tablica = {-3,1,2,-2,5,6};
        int expResult = 5;
        int result = JavaApplication2.DrugaNajwiekszaLiczba(tablica);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of TrzeciaNajwiekszaLiczba method, of class JavaApplication2.
     */
    @Test
    public void testTrzeciaNajwiekszaLiczba() {
        System.out.println("TrzeciaNajwiekszaLiczba");
        int[] tablica = {-3,1,2,-2,5,6};
        int expResult = 2;
        int result = JavaApplication2.TrzeciaNajwiekszaLiczba(tablica);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of MaxValue method, of class JavaApplication2.
     */
    @Test
    public void testMaxValue() {
        System.out.println("MaxValue");
        int[] tablica = {-3,1,2,-2,5,6};
        int expResult = 60;
        int result = JavaApplication2.MaxValue(tablica);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testTriplet() {
        System.out.println("Triplet");
        int[] tablica = {-3,1,2,-2,5,6};
        int naj1 = 6;
        int naj2 = 5;
        int naj3 = 2;
        int[] expResult = {2,4,5};
        int[] result = JavaApplication2.Triplet(tablica, naj1, naj2, naj3);
        Assert.assertArrayEquals(expResult, result);
       
    }
    
    
    
    
}
