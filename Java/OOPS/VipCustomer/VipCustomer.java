
package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailId;

//    Creating constructors

    public VipCustomer(){
    this("< Default Name >",0000.00,"< default@email.com >");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
    }


//    getters

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }
}
