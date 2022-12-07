
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
 * @author siddh
 */
public class SupplierAdminRole extends Role{
   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system){
       return new SysAdminWorkArea(userProcessContainer,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SysAdmin.getValue();
}
    
}

