/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class VolunteerDir {
    private ArrayList<Volunteer> volunteerList;

    public VolunteerDir() {
        volunteerList= new ArrayList<>();
        
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }
    //add a new volunteer
    public Volunteer addVolunteer(){
    
        Volunteer v = new Volunteer();
        volunteerList.add(v);
        return v;
    }
    //remove a volunteer
    public void removeVolunteer(Volunteer v){
        volunteerList.remove(v);
    }
}
