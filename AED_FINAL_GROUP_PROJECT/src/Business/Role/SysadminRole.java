/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.SysAdmin.SysAdminWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class SysadminRole extends Role{
   //overriding main panel with system admin work area whenever system admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
       return new SysAdminWorkArea(userProcessContainer,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.Sysadmin.getValue();
} 
}
