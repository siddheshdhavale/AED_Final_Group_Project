/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Employee.Employee;
import Business.Role.SysAdminRole;
import Business.UserCredentials.UserCredentials;
/**
 *
 * @author ghostdaddy16
 */
public class Configure {
     public static Ecosystem configure(){
    Ecosystem system= Ecosystem.getInstance();
   
     Employee employee= system.getEmployeeDir().createEmployee("SYSTEM ADMIN");
     //making defualt username, password for application admin role
     UserCredentials ua= system.getUserCredentialsDir().createUserCredentials("admin","admin", employee, new SysAdminRole());
    
    return system;
    }
    
}
