

package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String emailId;
    private String phoneNo;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of Rs. "+depositAmount+ "Your Updated Balance is = "+ this.balance);
    }

    public void withdrawl(double withdrawlAmount){
        if (this.balance - withdrawlAmount <0){
            System.out.println("You have insufficient balance in your account = "+ this.balance + "\nWithdrawl is not possible.");
        }else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of Rs. " + withdrawlAmount + "\nyour updated account balance is = Rs. " + this.balance);
        }
    }
}


