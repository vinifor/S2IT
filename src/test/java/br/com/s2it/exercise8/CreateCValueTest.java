/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.s2it.exercise8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinicius
 */
public class CreateCValueTest {

    public CreateCValueTest() {
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
     * Test of createCValue method, of class Exercicio8.
     */
    @Test
    public void createCValueWithEqualLength() {
        System.out.println("createCValueWithEqualLength");
        int a = 152;
        int b = 235;
        int expResult = 125325;
        int result = new CreateCValue().createCValue(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void createCValueWithDifferentLength() {
        System.out.println("createCValueWithDifferentLength");
        int a = 152;
        int b = 2;
        int expResult = 1252;
        int result = new CreateCValue().createCValue(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void createCValueWithValueBiggerThan1000000() {
        System.out.println("createCValueWithValueBiggerThan1000000");
        int a = 1524;
        int b = 2856;
        int expResult = -1;
        int result = new CreateCValue().createCValue(a, b);
        assertEquals(expResult, result);
    }

}
