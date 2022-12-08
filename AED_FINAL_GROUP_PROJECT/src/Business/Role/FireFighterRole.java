/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FireManOrganization;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.FireFighterWorkArea.FireFighterWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class FireFighterRole extends Role{
  //overridingg main panel with firefighter work area whenever firefighter role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new FireFighterWorkArea(userProcessContainer,credentials,(FireFighterOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.FireFighterRole.getValue();
}  
}
