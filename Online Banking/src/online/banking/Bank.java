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
public class Bank {
    String name;
    private List<Branch> branchList;
    
    public Bank(String name, List<Branch> branchList){
        this.name=name;
        this.branchList=branchList;
    }
    public int getTotalUsersInBank(){
        int NumOfUser = 0;
        List<User> userList;
        for (Branch branch : branchList){
            userList = branch.getUsers();
            for(User user : userList){
                NumOfUser++;
            }
        }
        return NumOfUser;
    }
    
    public List<Branch> getBranches(){
        return branchList;
    }
    public Branch addBranch(String name, List<User> userList){
        Branch branch = new Branch(name, userList);
        branchList.add(branch);
        return branch;
    }
    public void removeBranch(Branch branch){
        branchList.remove(branch);
    }
    //getters
    public String getName(){
        return this.name;
    }
    //setters
    public void setName(String Name){
        this.name=Name;
    }
}
