/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.Volunteer.VolunteerAdminWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class VolunteerAdminRole extends Role{
    //overriding main panel with volunteer admin work area whenever volunteer admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new VolunteerAdminWorkArea(userProcessContainer,enterprise);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.VolunteerAdminRole.getValue();
}

}
