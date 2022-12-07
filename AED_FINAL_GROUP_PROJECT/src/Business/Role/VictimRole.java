/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VictimOrganization;
import Business.UserCredentials.UserCredentials;
import UI.EventSeekerWorkArea.EventSeekerWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class VictimRole extends Role{
   //overriding main panel with victim work area whenever victim role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new EventSeekerWorkArea(userProcessContainer,credentials,(VictimOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.Victim.getValue();
} 
}
