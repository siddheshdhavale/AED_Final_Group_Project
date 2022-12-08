/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.UserCredentials.UserCredentials;
import UI.Supplier.SupplierWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author yashrevadekar
 */
public class SupplierRole extends Role{
    //overriding main panel with supplier work area whenever supplier role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new SupplierWorkArea(userProcessContainer,credentials,(SupplierOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SupplierRole.getValue();
}
 
}
