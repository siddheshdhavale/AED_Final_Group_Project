/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.VolunteerRole;
import Business.Volunteer.VolunteerDir;
import java.util.HashSet;
import Business.Role.Role;

/**
 *
 * @author yashrevadekar
 */
public class VolunteerOrganization extends Organization{
    
    VolunteerDir volunteerList;
    //constructor to add volunteer list to volunteer directory
    public VolunteerOrganization(String name) {
        super(Organization.Type.Volunteer.getValue());
        volunteerList= new VolunteerDir();
    }

    public VolunteerDir getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(VolunteerDir volunteerList) {
        this.volunteerList = volunteerList;
    }
    //hashmap to support volunteer role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VolunteerRole());
       return role;
    }
    
}
