/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDir;

/**
 *
 * @author ghostdaddy16
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDir organizationDir;
    
    public Enterprise(String name, EnterpriseType type)
    {
      super(name);
      this.enterpriseType= type;
      organizationDir = new OrganizationDir();
    }
    //enums for enterprise types        
    
     public enum EnterpriseType
     {
        Comm("Comm"),
        CSO("CSO"),
        Supplier ("Supplier"),
        Cops("Cops"),
        Hospital("Hospital"),
        FireFighter("FireFighter");
        
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
     }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDir getOrganizationDir() {
        return organizationDir;
    }

}
