/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.SupplierRole;
import Business.Supplier.SupplierDir;
import java.util.HashSet;
import Business.Role.Role;

/**
 *
 * @author yashrevadekar
 */
public class SupplierOrganization extends Organization{
    
    SupplierDir supplierList;
    //constructor to add provider list to provider directory
    public SupplierOrganization(String name) {
        super(Organization.Type.Supplier.getValue());
        supplierList= new SupplierDir();
      
    }

    public SupplierDir getSupplierList() {
        return supplierList;
    }

    public void setSuppilerList(SupplierDir supplierList) {
        this.supplierList = supplierList;
    }
    //hashmap to support provider list
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new SupplierRole());
        return role;
    }
    
}
