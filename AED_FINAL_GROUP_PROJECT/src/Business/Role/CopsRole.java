/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.CopsOrganization;
import Business.UserCredentials.UserCredentials;
import UI.CopsWorkArea.CopsWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class CopsRole extends Role{
     //overriding main panel with cops work area whenever cops role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new CopsWorkArea(userProcessContainer,credentials,(CopsOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.CopsRole.getValue();
}
 
}
