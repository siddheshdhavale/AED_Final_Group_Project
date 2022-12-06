/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class SupplierDir {
     private ArrayList<Supplier> supplierList;
    
    
    public SupplierDir() {
        supplierList=new ArrayList<>();
        
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    //add a new Supplier
    public Supplier addSupplier(){
        Supplier s= new Supplier();
        supplierList.add(s);
        return s;
    }
    //remove a Supplier
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }
}
