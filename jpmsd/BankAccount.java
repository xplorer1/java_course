package jpmsd;

public class BankAccount {
    private int accountNumber;
    private String customerName;
    private double balance;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void makeDeposit(double amount) {
        this.balance += amount;
    }

    public void makeWithdrawal(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds!! Get out!");
        } else {
            balance -= amount;
        }
    }
}
