
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserCredentials.UserCredentials;
import javax.swing.JPanel;

/**
 *
 * @author siddh
 */
public abstract class Role {
    //enums for types of roles
    public enum RoleType{
        SysAdmin("SysAdmin"),
        VictimAdmin("VictimAdmin"),
        Victim("Victim"),
        EventCreatorAdmin("EventCreatorAdmin"),
        EventCreator("EventCreator"),
        EnterPriseAdmin("EnterpriseAdmin"),
        CommAdminRole("CommAdminRole"),
        CSOAdminRole("CSOAdminRole"),
        CSOManagerRole("CSOManagerRole"),
        SupplierAdminRole("SupplierAdminRole"),
        SupplierManagerRole("SupplierManagerRole"),
        VolunteerAdminRole("VolunteerAdminRole"),
        VolunteerRole("VolunteerRole"),
        SupplierRole("SupplierRole"),
        CopsRole("CopsRole"),
        CopsAdminRole("CopsAdminRole"),
        DoctorAdminRole("DoctorAdminRole"),
        Doctor("Doctor"),
        FireFighterRole("FireFighterRole"),
        FireFighterAdminRole("FireFighterAdminRole");
        
        
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserCredentials credentials,Organization organization,Enterprise enterprise,Ecosystem system);
    
    
    
}
