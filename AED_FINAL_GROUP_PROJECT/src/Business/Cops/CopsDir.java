/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Cops;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class CopsDir {
   private ArrayList<Cops> copsList;

    public CopsDir() {
        copsList=new ArrayList();
        
    }

    public ArrayList<Cops> getCopsList() {
        return copsList;
    }

    public void setCopsList(ArrayList<Cops> policeList) {
        this.copsList = policeList;
    }
    
    //add a new cops 
    public Cops addCops(){
        Cops l= new Cops();
        copsList.add(l);
        return l;
    }
    //remove cops
    public void removeCops(Cops l){
        copsList.remove(l);
    } 
}
