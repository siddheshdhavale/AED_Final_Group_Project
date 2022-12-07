/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class OrganizationDir {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDir()
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    //creates new organizations and adds them to directory
    public Organization createOrganization(Organization.Type type,String name)
    {
    Organization organization = null;
        if (type.getValue().equals(Organization.Type.EventCreator.getValue())){
            
            organization = new EventCreatorOrganization();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Victim.getValue())){
            organization = new VictimOrganization();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CSO.getValue())){
            organization = new CSOOrganization();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Supplier.getValue())){
            organization = new SupplierOrganization(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Volunteer.getValue())){
            organization = new VolunteerOrganization(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Cops.getValue())){
            organization = new CopsOrganization(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DocOrganization();
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FireFighter.getValue())){
            organization = new FireFighterOrganization(name);
            organization.setOrgName(name);
            organizationList.add(organization);
        }
        
        return organization;
    }
    
}
