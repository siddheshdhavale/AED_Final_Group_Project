/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CSO;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class CSODir {
    private ArrayList<CSO> csodir;

    public CSODir() {
    csodir= new ArrayList<>();
    }

    public ArrayList<CSO> getCsodir() {
        return csodir;
    }

    public void setCsodir(ArrayList<CSO> csodir) {
        this.csodir = csodir;
    }
    //add a CSO
    public CSO addCSO(){
        CSO cso =new CSO();
        csodir.add(cso);
        return cso;
    }
    //remove a CSO
    public void removeCSO(CSO cso){
        csodir.remove(cso);   
    }
}
