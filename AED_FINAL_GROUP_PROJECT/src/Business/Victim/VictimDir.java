/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Victim;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class VictimDir {
    private ArrayList<Victim> changeSeekerDir;

    public VictimDir() {
        changeSeekerDir=new ArrayList<>();
        
    }

    public ArrayList<Victim> getChangeSeekerDir() {
        return changeSeekerDir;
    }

    public void setChangeSeekerDir(ArrayList<Victim> changeSeekerDir) {
        this.changeSeekerDir = changeSeekerDir;
    }
    //add a new victim
    public Victim addChangeSeeker(){
        Victim cs= new Victim();
        changeSeekerDir.add(cs);
        return cs;
    }
    //remove a victim
    public void removeChangeSeeker(Victim cs){
        changeSeekerDir.remove(cs);
    }
}
