/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.FireFighter.FireFighterDir;
import java.util.HashSet;
import Business.Role.Role;
import Business.Role.FireFighterRole;

/**
 *
 * @author yashrevadekar
 */
public class FireFighterOrganization extends Organization{
    
    FireFighterDir fireManlist;
    //constructor to add fireman list to fireman directory
    public FireFighterOrganization(String name)
    {
        super(Organization.Type.FireFighter.getValue());
        fireManlist=new FireFighterDir();
    }



    //hasmap to support fire man role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new FireFighterRole());
       return role;
       
    }
}
