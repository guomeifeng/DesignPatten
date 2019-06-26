/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kelly
 */
public class CustomerBuilderTest {
    
    public CustomerBuilderTest() {
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
     * Test of getSigleInstance method, of class CustomerBuilder.
     */
    @Test
    public void testGetSigleInstance() {
        System.out.println("getSigleInstance");
        CustomerBuilder instance = null;
        CustomerBuilder expResult = null;
        CustomerBuilder result = instance.getSigleInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class CustomerBuilder.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Connection con = null;
        int custno = 0;
        CustomerBuilder instance = CustomerBuilder.getSigleInstance();
        CustomerBasic customer1 = instance.getCustomer(con, 32093);
        CustomerBasic customer2 = instance.getCustomer(con, 32094);
        CustomerBasic expResult = null;
        CustomerBasic result = instance.getCustomer(con, custno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
