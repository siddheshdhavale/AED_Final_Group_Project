/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import java.util.ArrayList;

/**
 *
 * @author ghostdaddy16
 */
public class EnterpriseDir{
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDir()
    {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    //Creating and adding  new enterprises
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Comm){
            enterprise = new CommEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Supplier){
            enterprise= new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if(type == Enterprise.EnterpriseType.CSO){
            enterprise= new CSOEnterprise(name);
            enterpriseList.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Cops){
            enterprise= new CopsEnterprise(name);
            enterpriseList.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Hospital){
            enterprise= new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
         } 
            else if(type == Enterprise.EnterpriseType.FireFighter){
            enterprise= new FireFighterEnterprise(name);
            enterpriseList.add(enterprise);
         }
        return enterprise;
        
    }
   
    
        
    
}
