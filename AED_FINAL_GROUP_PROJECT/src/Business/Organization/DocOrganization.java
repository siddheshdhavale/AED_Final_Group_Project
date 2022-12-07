/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Hospital.HospitalDir;
import Business.Role.DocRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author yashrevadekar
 */
public class DocOrganization extends Organization{
    
    HospitalDir docList;
    //constructor to add doctor list to hospital directory
    public DocOrganization()
    {
        super(Organization.Type.Doctor.getValue());
        docList= new HospitalDir();
    }

    public HospitalDir getHospitallist() {
        return docList;
    }

    public void setHospitallist(HospitalDir docList) {
        this.docList = docList;
    }
    
    //hashmap to support doctor role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DocRole());
       return role;
    }
    
    
}
