/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVLTree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author getna
 */
public class AVLTreeIT {
    
    public AVLTreeIT() {
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
     * Test of find method, of class AVLTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        int key = 0;
        AVLTree instance = new AVLTree();
        AVLTree.Node expResult = null;
        AVLTree.Node result = instance.find(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AVLTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int key = 0;
        AVLTree instance = new AVLTree();
        instance.insert(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AVLTree.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int key = 0;
        AVLTree instance = new AVLTree();
        instance.delete(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoot method, of class AVLTree.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        AVLTree instance = new AVLTree();
        AVLTree.Node expResult = null;
        AVLTree.Node result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of height method, of class AVLTree.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        AVLTree instance = new AVLTree();
        int expResult = 0;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class AVLTree.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        AVLTree.Node n = null;
        AVLTree instance = new AVLTree();
        int expResult = 0;
        int result = instance.getBalance(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
