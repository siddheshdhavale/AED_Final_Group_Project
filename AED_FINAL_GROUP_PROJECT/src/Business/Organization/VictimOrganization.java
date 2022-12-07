/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.VictimRole;
import Business.Victim.VictimDir;
import java.util.HashSet;

/**
 *
 * @author yashrevadekar
 */
public class VictimOrganization extends Organization{
    
    VictimDir victimList;
    //constructor to add victim list to victim directory
    public VictimOrganization()
    {
        super(Organization.Type.Victim.getValue());
        victimList=new VictimDir();
    }

    public VictimDir getChangeseekerlist() {
        return victimList;
    }

    public void setChangeseekerlist(VictimDir victimList) {
        this.victimList = victimList;
    }
    //hashmap to support victim list
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VictimRole());
        return role;
        
    }
    
}
