/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.s2it.exercise9;

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
public class BinaryTreeTest {

    private final BinaryTree root = new  BinaryTree();
    
    private final BinaryTree right = new  BinaryTree();
    private final BinaryTree left = new  BinaryTree();
    
    private final BinaryTree rightRight = new  BinaryTree();
    private final BinaryTree rightLeft = new  BinaryTree();
    private final BinaryTree leftRight = new  BinaryTree();
    private final BinaryTree leftLeft = new  BinaryTree();

    public BinaryTreeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        root.setValor(1);
        root.setLeft(left);
        root.setRight(right);
        
        left.setValor(2);
        left.setLeft(leftLeft);
        left.setRight(leftRight);
        
        right.setValor(3);
        right.setLeft(rightLeft);
        right.setRight(rightRight);
        
        leftLeft.setValor(4);
        leftRight.setValor(5);
        rightLeft.setValor(6);
        rightRight.setValor(7);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class BinaryTree.
     */
    @Test
    public void testSumRoot() {
        System.out.println("testSumRoot");
        int expResult = 28;
        int result = new BinaryTree().sum(root);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumLeft() {
        System.out.println("testSumLeft");
        int expResult = 11;
        int result = new BinaryTree().sum(left);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumRight() {
        System.out.println("testSumRight");
        int expResult = 16;
        int result = new BinaryTree().sum(right);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumNullLeft() {
        System.out.println("testSumNullRight");
        root.setLeft(null);
        int expResult = 17;
        int result = new BinaryTree().sum(root);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumNullRight() {
        System.out.println("testSumNullLeft");
        root.setRight(null);
        int expResult = 12;
        int result = new BinaryTree().sum(root);
        assertEquals(expResult, result);
    }

}
