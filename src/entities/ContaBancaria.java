package entities;

public class ContaBancaria {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public ContaBancaria(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public ContaBancaria(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public String getHolder(){
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void depositBalance(double balance){
        this.balance += balance;
    }

    public double withdrawBalance(double balance){
        this.balance -= (balance + 5.00);
        return this.balance;
    }
}
