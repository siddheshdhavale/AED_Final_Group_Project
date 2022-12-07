/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.CSOEnterprise.CSOAdminWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class CSOAdminRole extends Role{
    //overriding main panel with CSO admin work area whenever CSO admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new CSOAdminWorkArea(userProcessContainer,enterprise,system);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.CSOAdminRole.getValue();
}
}
