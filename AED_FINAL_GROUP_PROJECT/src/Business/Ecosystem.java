/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import Business.UserCredentials.UserCredentials;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author ghostdaddy16
 */
public class Ecosystem extends Organization {
     private static Ecosystem business;
    private ArrayList<Network> networkList;
   
     public static Ecosystem getInstance()
    {
     if(business == null)
     {
         business = new Ecosystem();
     }
     return business;
    }
    //constructor for Ecosystem class
    private Ecosystem()
    {
        super(null);
        networkList = new ArrayList<>();
        
    }
       public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(Ecosystem system)
    {
        business = system;
    }
    //add a network
    public Network addNetwork()
    {
      Network  network = new Network();
      networkList.add(network);
      return network;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SysAdminRole());
        
        return role;
    
    }
    
}
