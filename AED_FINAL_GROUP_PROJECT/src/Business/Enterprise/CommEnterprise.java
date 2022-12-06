/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.EventCreatorAdminRole;
import Business.Role.Role;
import Business.Role.VolunteerAdminRole;
import java.util.HashSet;
import Business.Role.VictimAdminRole;

        


/**
 *
 * @author ghostdaddy16
 */
public class CommEnterprise extends Enterprise{
     public CommEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Comm);
    }
    //add roles using hashsets
    @Override
     public HashSet<Role> getSupportedRole(){
       
        role.add(new EventCreatorAdminRole());
              
        role.add(new VictimAdminRole());
        
        role.add(new VolunteerAdminRole());
       
        return role;
        
    }
    
    
    
}
