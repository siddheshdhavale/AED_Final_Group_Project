/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VolunteerOrganization;
import Business.UserCredentials.UserCredentials;
import UI.Volunteer.DashboardVolunteer;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class VolunteerRole extends Role {
    //overriding main panel with volunteer work area whenever volunteer role is called
        @Override
        public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system)
        {
            return new DashboardVolunteer(userProcessContainer,credentials,(VolunteerOrganization)organization,enterprise,system);
        }   
        @Override
        public String toString()
{
   return Role.RoleType.VolunteerRole.getValue();
}
}
