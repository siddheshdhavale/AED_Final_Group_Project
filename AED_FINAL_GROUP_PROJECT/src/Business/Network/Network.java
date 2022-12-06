/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;
import Business.Enterprise.EnterpriseDir;
/**
 *
 * @author yashrevadekar
 */
public class Network {
   private String name;
    private EnterpriseDir enterpriseDir;
    
    public Network()
    {
     enterpriseDir = new EnterpriseDir();
    }

    public EnterpriseDir getEnterpriseDir() {
        return enterpriseDir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return name;
    } 
}
