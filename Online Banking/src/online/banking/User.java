/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.banking;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcman
 */
public class User {
    String name;
    String ssn;
    String password;
    double checkingBalance;
    double savingBalance;
    SavingAccount saving;
    CheckingAccount checking;
    
    public User(String name, String ssn, String password, double checkingBalance, double savingBalance){
        this.name=name;
        this.ssn=ssn;
        this.password=password;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        this.saving = new SavingAccount(savingBalance);
        this.checking = new CheckingAccount(checkingBalance);
    }

    //getters
    public SavingAccount getSavings(){
        return saving;
    }
    public CheckingAccount getChecking(){
        return checking;
    }
    public String getName(){
        return name;
    }
    public String getSsn(){
        return ssn;
    }
    public String getPassword(){
        return password;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }
    
    //setters
    public void setName(String Name){
        this.name=Name;
    }
    public void setSsn(String Ssn){
        this.ssn=Ssn;
    }
    public void setPassword(String Password){
        this.password=Password;
    }
    public void setCheckingBalance(double balance) {
        checkingBalance=balance;
    }
    public void setSavingBalance(double balance) {
        savingBalance=balance;
    }
}

