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
public class SignupManagerTest {
    
    public SignupManagerTest() {
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
     * Test of setLoginManagerReference method, of class SignupManager.
     */
    @Test
    public void testSetLoginManagerReference() {
        System.out.println("setLoginManagerReference");
        LoginManager lmg = null;
        SignupManager instance = new SignupManager();
        instance.setLoginManagerReference(lmg);
        assertEquals(true,instance.setLoginManagerReference(lmg));
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setUserIdentifier method, of class SignupManager.
     */
    @Test
    public void testSetUserIdentifier() {
        System.out.println("setUserIdentifier");
        String userIdentifier = "";
        SignupManager instance = new SignupManager();
        instance.setUserIdentifier(userIdentifier);
 assertEquals(true,instance.setUserIdentifier(userIdentifier));      
// TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hideLoginButton method, of class SignupManager.
     */
    @Test
    public void testHideLoginButton() {
        System.out.println("hideLoginButton");
        SignupManager instance = new SignupManager();
        instance.hideLoginButton();
        assertEquals(true,instance.hideLoginButton());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of sign_up method, of class SignupManager.
     */
//    @Test
//    public void testSign_up() {
//        System.out.println("sign_up");
//        String a = "abc";
//        String b = "efg";
//        String c = "hij";
//        String d = "zzz";
//        SignupManager instance = new SignupManager();
//        boolean expResult = true;
//        boolean result = instance.sign_up(a, b, c, d);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
    
}
