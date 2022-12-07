/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.HashSet;
import Business.Role.CSOManagerRole;
import Business.Role.Role;
import Business.CSO.CSODir;


/**
 *
 * @author yashrevadekar
 */
public class CSOOrganization extends Organization{
    
    CSODir csolist;
    //constructor to add CSO list to CSO directory
    public CSOOrganization()
    {
        super(Organization.Type.CSO.getValue());
        csolist=new CSODir();
    }

    public CSODir getCsolist() {
        return csolist;
    }

    public void setCsolist(CSODir csolist) {
        this.csolist = csolist;
    }

    
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new CSOManagerRole());
       return role;
       
    }
    
}
