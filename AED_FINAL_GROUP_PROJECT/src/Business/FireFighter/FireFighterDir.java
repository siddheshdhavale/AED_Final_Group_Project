/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FireFighter;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class FireFighterDir {
    private ArrayList<FireFighter> fireFighterList;

    public FireFighterDir() {
        fireFighterList=new ArrayList();
        
    }

    public ArrayList<FireFighter> getFireFighterList() {
        return fireFighterList;
    }

    public void setCopsList(ArrayList<FireFighter> fireFighterList) {
        this.fireFighterList = fireFighterList;
    }
    
    //add new fire fighter
    public FireFighter addFireFighter(){
        FireFighter l= new FireFighter();
        fireFighterList.add(l);
        return l;
    }
    //remove a fire fighter
    public void removeFireMan(FireFighter l){
        fireFighterList.remove(l);
    }
}
