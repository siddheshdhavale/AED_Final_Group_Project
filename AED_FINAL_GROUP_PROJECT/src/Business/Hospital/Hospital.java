/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

/**
 *
 * @author yashrevadekar
 */
public class Hospital {
     private String Dname;
    private String Did;
    private static int count=1;
    
    //Hospital constructor to generate id automatically
    public Hospital() {
        
        
        Did="ORG"+(++count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Hospital.count = count;
    }
    
    
     
    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public String getDid() {
        return Did;
    }

    public void setDid(String Did) {
        this.Did = Did;
    }

   

    @Override
    public String toString(){
    return Dname;
    
    }
}
