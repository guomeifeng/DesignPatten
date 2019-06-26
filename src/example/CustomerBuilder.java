/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.sql.Connection;

/**
 *
 * @author kelly
 */
public class CustomerBuilder {
    
    private static CustomerBuilder singleInstance;
    
    private CustomerBuilder(){
        
    }
    
    public CustomerBasic createNewCustomer(Connection con, int custno){
        CustomerBasic customer = new CustomerBasic();
        customer.setCustno(custno);
        customer = getGeneralFromTable(con, customer);
        customer = getAddressFromTable(con, customer);
        return customer;
    }
    
    
    public static CustomerBuilder getSigleInstance(){
        if (null==CustomerBuilder.singleInstance) {
            synchronized(CustomerBuilder.class){
                CustomerBuilder.singleInstance = new CustomerBuilder();
            }
        }
        return CustomerBuilder.singleInstance;   
    }
    
    private CustomerBasic getGeneralFromTable(Connection con, CustomerBasic customer){
        customer.setCategory("category1");
        return customer;
    }
    
    private CustomerBasic getAddressFromTable(Connection con, CustomerBasic customer){
        customer.setH_address("haddress");
        return customer;
    }    
}
