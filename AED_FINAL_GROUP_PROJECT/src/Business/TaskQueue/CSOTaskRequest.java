/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TaskQueue;

/**
 *
 * @author siddh
 */
public class CSOTaskRequest extends TaskRequest{
    
    private String title;
    private String description;
    private String location;
    private int vRequired;
    private int vAcquired;
    private boolean add;
    private String volQty;
    
    public CSOTaskRequest() {
        
        add = false;
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getvRequired() {
        return vRequired;
    }

    public void setvRequired(int vRequired) {
        this.vRequired = vRequired;
    }

    public int getvAcquired() {
        return vAcquired;
    }

    public void setvAcquired(int vAcquired) {
        this.vAcquired = vAcquired;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public String getVolQty() {
        return volQty;
    }

    public void setVolQty(String volQty) {
        this.volQty = volQty;
    }
    
    
}
