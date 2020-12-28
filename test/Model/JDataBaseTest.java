/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class JDataBaseTest {
    
    JDataBase j;
    
    public JDataBaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        j=new JDataBase();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getQueryResult method, of class JDataBase.
     */
    @Test
    public void testGetQueryResult() {
        System.out.println("getQueryResult");
        String query = "";
        JDataBase instance = new JDataBase();
        ResultSet expResult = null;
        ResultSet result = instance.getQueryResult(query);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of insertRow method, of class JDataBase.
     */
    @Test
    public void testInsertRow() {
        System.out.println("insertRow");
        String query = "";
        JDataBase instance = new JDataBase();
        instance.insertRow(query);
        assertEquals(true,instance.insertRow(query));
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRow method, of class JDataBase.
     */
    @Test
    public void testDeleteRow() throws SQLException {
       // try {
            System.out.println("deleteRow");
            String query = "";
            JDataBase instance = new JDataBase();
            instance.deleteRow(null);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//        } catch (SQLException ex) {
//            Logger.getLogger(JDataBaseTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        assertEquals(true,instance.deleteRow(null)); 
    }

    /**
     * Test of isDataBaseConnected method, of class JDataBase.
     */
    @Test
    public void testIsDataBaseConnected() {
        System.out.println("isDataBaseConnected");
        JDataBase instance = new JDataBase();
        boolean expResult = true;
        boolean result = instance.isDataBaseConnected();
        assertEquals(expResult, instance.isDataBaseConnected());
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
