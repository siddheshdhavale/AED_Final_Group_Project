/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserCredentials;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author siddh
 */
public class UserCredentialsDir {
     private ArrayList<UserCredentials> UserCredentialsList;
    
    public UserCredentialsDir(){
        UserCredentialsList=new ArrayList<>();
        
    }

    public ArrayList<UserCredentials> getUserAccountList() {
        return UserCredentialsList;
    }
    //aunthenticate a user
    public UserCredentials authenticateUser(String username, String password){
        for(UserCredentials uc:UserCredentialsList){
            if(uc.getUsername().equals(username)&& uc.getPassword().equals(password)){
                return uc;
            }
        }
        return null;
    }
    //create new user 
    public UserCredentials createUserAccount(String username, String password, Employee employee, Role role){
        UserCredentials userAccount = new UserCredentials();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        UserCredentialsList.add(userAccount);
        return userAccount;
    }
    //username unique check
    public boolean checkIfUsernameIsUnique(String username){
        for(UserCredentials uc: UserCredentialsList)
            if(uc.getUsername().equals(username)){
                return false;
            }
        return true;
    }
}
