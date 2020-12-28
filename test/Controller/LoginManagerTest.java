/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class LoginManagerTest {
    
    public LoginManagerTest() {
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
     * Test of clearTextFields method, of class LoginManager.
     */
    @Test
    public void testClearTextFields() {
        System.out.println("clearTextFields");
        LoginManager instance = new LoginManager();
        instance.clearTextFields();
        assertEquals(true,instance.clearTextFields());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of signin method, of class LoginManager.
     */
//    @Test
//    public void testSignin() {
//        System.out.println("signin");
//        String a = "admin";
//        String b = "admin123";
//        LoginManager instance = new LoginManager();
//        boolean expResult = true;
//        boolean result = instance.signin(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
    
}
