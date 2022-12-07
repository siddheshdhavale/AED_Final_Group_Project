/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CSOOrganization;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.CSOManager.CSOManagerWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class CSOManagerRole extends Role{
    //overridng main panel with CSO Manager work area whenever CSO Manager role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new CSOManagerWorkArea(userProcessContainer,credentials,(CSOOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.CSOManagerRole.getValue();
} 
}
