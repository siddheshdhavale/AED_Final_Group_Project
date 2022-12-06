/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise; 

import Business.Role.CopsRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author ghostdaddy16
 */
public class CopsEnterprise extends Enterprise{
    public CopsEnterprise(String name){
            super(name,Enterprise.EnterpriseType.Cops);
    }
    //police role addtion using hashmaps
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new CopsRole());
        return role;
    }
}
