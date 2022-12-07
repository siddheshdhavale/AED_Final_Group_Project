/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author ghostdaddy16
 */
public class SysAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserCredentials credentials, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new SysAdminWorkArea(userProcessContainer, system);
    }

    @Override
    public String toString() {

        return Role.RoleType.SysAdmin.getValue();
    }

}
