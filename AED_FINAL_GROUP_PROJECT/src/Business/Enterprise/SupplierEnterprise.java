/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.SupplierManagerRole;
import Business.Role.Role;
import java.util.HashSet;
/**
 *
 * @author ghostdaddy16
 */
public class SupplierEnterprise extends Enterprise{
    public SupplierEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Supplier);
        
    } 
    //hash map to for Provider role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        new SupplierManagerRole();
        return role;
        
    }
}
