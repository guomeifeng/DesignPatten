/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Date;

public class GeneralInfo{
    private int custno;
    private int groupno;
    private String customerType;
    private String company;
    private String category;
    private Date date_modified;
    private String custid_alt1;
    private String cust_type;
    private String custTypeEl;
    public int getCustno() {
        return custno;
    }

    public void setCustno(int custno) {
        this.custno = custno;
    }

    public int getGroupno() {
        return groupno;
    }

    public void setGroupno(int groupno) {
        this.groupno = groupno;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }

    public String getCustid_alt1() {
        return custid_alt1;
    }

    public void setCustid_alt1(String custid_alt1) {
        this.custid_alt1 = custid_alt1;
    }

    public String getCust_type() {
        return cust_type;
    }

    public void setCust_type(String cust_type) {
        this.cust_type = cust_type;
    }



    public String getCustTypeEl() {
        return custTypeEl;
    }

    public void setCustTypeEl(String custTypeEl) {
        this.custTypeEl = custTypeEl;
    }    
}