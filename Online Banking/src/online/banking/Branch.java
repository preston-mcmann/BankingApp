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
public class Branch {

    String name;
    private List<User> userList;

    public Branch(String name, List<User> userList) {
        this.name = name;
        this.userList = userList;
    }

    public List<User> getUsers() {
        return userList;
    }

    public void print() {
        for (User u : userList) {
            System.out.print(u.getName());
        }
    }



    public int compare(String Username, String SSN, String Password) {
        int index = -1;
        for (int i = 0; i < userList.size(); i++) {
             if(userList.get(i).getName().equals(Username) && userList.get(i).getPassword().equals(Password)&&userList.get(i).getSsn().equals(SSN)){
                index = i;
             }
        }       
        return index;//index of user in list
        }
    
    public void addUser(String Username, String SSN, String Password, double checking, double saving){
        User user = new User(Username,SSN,Password,checking, saving);
        userList.add(user);
    }
    public void removeUser(User user){
        userList.remove(user);
    }
    //getters
    public String getName() {
        return this.name;
    }

    //setters
    public void setName(String Name) {
        this.name = Name;
    }
}
