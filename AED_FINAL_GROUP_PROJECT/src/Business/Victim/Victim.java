/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Victim;
import Business.TaskQueue.TaskQueue;
/**
 *
 * @author siddh
 */
public class Victim {
    private String name;
    private String id;
    private TaskQueue taskqueue;
    
    private static int count=1;
    //victim class constructor to autogenerate id
     public Victim(){
         
        id= "Victim"+(++count);
    }

    public TaskQueue getTaskkqueue() {
        return taskqueue;
    }

    public void setTaskqueue(TaskQueue taskqueue) {
        this.taskqueue = taskqueue;
    }
 
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
     @Override
     public String toString(){
         return name;
     }
}
