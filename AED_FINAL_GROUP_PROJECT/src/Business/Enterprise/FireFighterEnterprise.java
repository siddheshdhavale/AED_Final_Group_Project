/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Role.FireFighterRole;
import Business.Role.Role;
import java.util.HashSet;
/**
 *
 * @author ghostdaddy16
 */
public class FireFighterEnterprise extends Enterprise{
     public FireFighterEnterprise(String name){
        super(name,Enterprise.EnterpriseType.FireFighter);
    }
    //hash map to for Fire Man role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new FireFighterRole());
        return role;
    }
    
}
