/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class HospitalDir {
    private ArrayList<Hospital> hospitaldir;
    
    public HospitalDir() {
    hospitaldir= new ArrayList();
    }

    public ArrayList<Hospital> getHospitalDir() {
        return hospitaldir;
    }

    public void setHospitalDir(ArrayList<Hospital> hospitaldir) {
        this.hospitaldir = hospitaldir;
    }
    //add a new doctor
    public Hospital addHospital(){
        Hospital h =new Hospital();
        hospitaldir.add(h);
        return h;
    }
    //remove a doctor
    public void removeHospital(Hospital hospital){
        hospitaldir.remove(hospital);   
    }
}
