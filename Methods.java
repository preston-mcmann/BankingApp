///////////////////////BANK METHODS///////////////////////
//add Branch to bank  
public Branch addBranch(String name, List<User> userList){
        Branch branch = new Branch(name, userList);
        branchList.add(branch);
        return branch;
    }
//remove branch from bank
public void removeBranch(Branch branch){
        branchList.remove(branch);
    }
//return number of users in bank
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
///////////////////////BRANCH METHODS///////////////////////
//verify function to return index of user in branch list, if return -1 user isnt in list
public int compare(String Username, String SSN, String Password) {
        int index = -1;
        for (int i = 0; i < userList.size(); i++) {
             if(userList.get(i).getName().equals(Username) && userList.get(i).getPassword().equals(Password)&&userList.get(i).getSsn().equals(SSN)){
                index = i;
             }
        }       
        return index;
        }
//creates user with parameters and adds to userList of the branch
public void addUser(String Username, String SSN, String Password, double checking, double saving){
        User user = new User(Username,SSN,Password,checking, saving);
        userList.add(user);
    }
//removes user from list
public void removeUser(User user){
        userList.remove(user);
    }
///////////////////////USER METHODS///////////////////////
//Constructor for user to make checking and savings account
public User(String name, String ssn, String password, double checkingBalance, double savingBalance){
        this.name=name;
        this.ssn=ssn;
        this.password=password;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        this.saving = new SavingAccount(savingBalance);
        this.checking = new CheckingAccount(checkingBalance);
    }
///////////////////////ACCOUNT METHODS///////////////////////
//withdrawal function
    public void withdrawal(double withdrawal){
        if (withdrawal<=getBalance()&& withdrawal>=0){
            double amount= getBalance()-withdrawal;
            setBalance(amount);
        }else{
            System.out.println("Error");
        }
    }
//deposit function
    public void deposit(double deposit){
        double amount= getBalance()+deposit;
      
