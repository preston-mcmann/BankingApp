/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.banking;

/**
 *
 * @author mcman
 */
public class Account {
    protected int id; 
    protected double balance;
    protected double interestRate;
    
    public Account( double balance) {
	
        this.balance=balance;
    
	}
    public void withdrawal(double withdrawal){
        if (withdrawal<=getBalance()&& withdrawal>=0){
            double amount= getBalance()-withdrawal;
            setBalance(amount);
        }else{
            System.out.println("Error");
        }
    }
    public void deposit(double deposit){
        double amount= getBalance()+deposit;
        setBalance(amount);
    }
    //Getters

    public double getBalance(){
      return this.balance;
    }
    
    public double getInterestRate(){
      return this.interestRate;
    }      
    //Setters

    public void setBalance(double Balance){
        this.balance=Balance;
    }
    
    public void setInterestRate(double InterestRate){
        this.interestRate= InterestRate;
    }      
    public void print(){
        System.out.print(balance);
    }
}
