/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import UI.SupplierManager.SupplierManagerWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author yashrevadekar
 */
public class SupplierManagerRole extends Role{
      //overriding main panel with supplier manager work area whenever supplie manager role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
        return new SupplierManagerWorkArea(userProcessContainer,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SupplierManagerRole.getValue();
}
}
