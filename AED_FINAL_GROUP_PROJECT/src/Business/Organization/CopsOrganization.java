/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Cops.CopsDir;
import Business.Role.CopsRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author yashrevadekar
 */
public class CopsOrganization extends Organization{
    
    CopsDir copslist;
    //constructor to add police list to police directory
    public CopsOrganization(String name)
    {
        super(Organization.Type.Cops.getValue());
        copslist=new CopsDir();
    }


    public CopsDir getPolicelist() {
        return copslist;
    }

    public void setPolicelist(CopsDir copslist) {
        this.copslist = copslist;
    }
    //hasmap to support police role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new CopsRole());
       return role;
       
    } 
}
