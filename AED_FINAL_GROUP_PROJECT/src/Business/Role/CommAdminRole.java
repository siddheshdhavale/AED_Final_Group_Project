/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.CommEnterprise.CommAdminWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class CommAdminRole extends Role{
      //overriding main panel with community admin work area whenever community admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new CommAdminWorkArea(userProcessContainer,enterprise,system);
    } 
        @Override
        public String toString()
{
   return Role.RoleType.CommAdminRole.getValue();
}
}
