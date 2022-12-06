/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CSOManagerRole;
import Business.Role.Role;
import java.util.HashSet;


/**
 *
 * @author ghostdaddy16
 */
public class CSOEnterprise extends Enterprise {
    public CSOEnterprise(String name){
        super(name,Enterprise.EnterpriseType.CSO);
    }
    //hash map to for NGO role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new CSOManagerRole());
        return role;
    }
}
