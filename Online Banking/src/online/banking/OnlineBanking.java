/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package online.banking;

import java.util.ArrayList;


/**
 *
 * @author mcman
 */
public class OnlineBanking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Branch> BranchList = new ArrayList<>();
       
        ArrayList<User> userListO = new ArrayList<>();
        ArrayList<User> userListT = new ArrayList<>();
        ArrayList<User> userListL = new ArrayList<>();

        User user1 = new User("Preston", "123123123", "123", 100, 100);
        User user2 = new User("Darren", "123123123", "123", 234, 201);
        User user3 = new User("Me", "123123123", "123", 321, 231);
        User user4 = new User("You", "123123123", "123", 457, 342);

        userListO.add(user1);
        userListO.add(user2);
        userListO.add(user3);
        userListO.add(user4);

        Branch Ottawa = new Branch("Ottawa", userListO);
        Branch Toronto = new Branch("Toronto", userListT);
        Branch London = new Branch("London", userListL);

        BranchList.add(Ottawa);
        BranchList.add(Toronto);
        BranchList.add(London);

        Bank bank = new Bank("Bank", BranchList);
        new MainMenu(bank).setVisible(true);

    }

}
