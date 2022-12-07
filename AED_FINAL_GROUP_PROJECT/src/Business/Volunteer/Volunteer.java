/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Volunteer;
import Business.TaskQueue.TaskQueue;
/**
 *
 * @author siddh
 */
public class Volunteer {
    private String volunteerName;
    private String id;
    private static int count=1;
    private TaskQueue taskqueue;
    //Volunteer class constructor to autogenerate id
    public Volunteer() {
        id="Vol"+(++count);
        taskqueue= new TaskQueue();
    }
    
    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }
    
    public TaskQueue getTaskQueue() {
        return taskqueue;
    }

    public void setTaskQueue(TaskQueue taskqueue) {
        this.taskqueue = taskqueue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
    return volunteerName;
    
    }
}
