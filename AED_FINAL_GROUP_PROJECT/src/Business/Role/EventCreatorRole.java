/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventCreatorOrganization;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.EventCreatorWorkArea.EventCreatorWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class EventCreatorRole extends Role{
      //overriding main panel with event creator work area whenever event maker role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new EventCreatorWorkArea(userProcessContainer,credentials,(EventCreatorOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.EventCreator.getValue();
}
}
