/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Date;

/**
 *
 * @author kelly
 */
public class CustomerBasic {

    private GeneralInfo generalInfo;
    private HomeAddress homeAddress;

    public CustomerBasic() {
        this.generalInfo = new GeneralInfo();
        this.homeAddress = new HomeAddress();
    }

    public int getCustno() {
        return this.generalInfo.getCustno();
    }

    public void setCustno(int custno) {
        this.generalInfo.setCustno(custno);
    }

    public int getGroupno() {
        return this.generalInfo.getGroupno();
    }

    public void setGroupno(int groupno) {
        this.generalInfo.setGroupno(groupno);
    }

    public String getCustomerType() {
        return this.generalInfo.getCustomerType();
    }

    public void setCustomerType(String customerType) {
        this.generalInfo.setCustomerType(customerType);
    }

    public String getCategory() {
        return this.generalInfo.getCategory();
    }

    public void setCategory(String category) {
        this.generalInfo.setCategory(category);
    }

    public String getCompany() {
        return this.generalInfo.getCompany();
    }

    public void setCompany(String company) {
        this.generalInfo.setCompany(company);
    }

    public Date getDate_modified() {
        return this.generalInfo.getDate_modified();
    }

    public void setDate_modified(Date date_modified) {
        this.generalInfo.setDate_modified(date_modified);
    }

    public String getCustid_alt1() {
        return this.generalInfo.getCustid_alt1();
    }

    public void setCustid_alt1(String custid_alt1) {
        this.generalInfo.setCustid_alt1(custid_alt1);
    }

    public String getCust_type() {
        return this.generalInfo.getCust_type();
    }

    public void setCust_type(String cust_type) {
        this.generalInfo.setCust_type(cust_type);
    }

    public String getCustTypeEl() {
        return this.generalInfo.getCustTypeEl();
    }

    public void setCustTypeEl(String custTypeEl) {
        this.generalInfo.setCustTypeEl(custTypeEl);
    }

    public String getH_address() {
        return this.homeAddress.getH_address();
    }

    public void setH_address(String h_address) {
        this.homeAddress.setH_address(h_address);
    }

    public String getH_address2() {
        return this.homeAddress.getH_address2();
    }

    public void setH_address2(String h_address2) {
        this.homeAddress.setH_address2(h_address2);
    }

    public String getH_suburb() {
        return this.homeAddress.getH_suburb();
    }

    public void setH_suburb(String h_suburb) {
        this.homeAddress.setH_suburb(h_suburb);
    }

    public String getH_state() {
        return this.homeAddress.getH_state();
    }

    public void setH_state(String h_state) {
        this.homeAddress.setH_state(h_state);
    }

    public String getPostcode() {
        return this.homeAddress.getPostcode();
    }

    public void setPostcode(String postcode) {
        this.homeAddress.setPostcode(postcode);
    }

    public String getH_country() {
        return this.homeAddress.getH_country();
    }

    public void setH_country(String h_country) {
        this.homeAddress.setH_country(h_country);
    }
    
    public static void main (String[] args){
        CustomerBasic basic = new CustomerBasic();
        basic.setCategory("a");
        basic.setH_state("state");
    }

}
