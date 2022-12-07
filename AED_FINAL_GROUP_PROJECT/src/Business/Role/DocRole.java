/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.DoctorWorkArea.DoctorWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class DocRole extends Role{
    //overriding main panel with doctor work area whenever doctor role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new DoctorWorkArea(userProcessContainer,credentials,(DoctorOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.Doctor.getValue();
}  
}
