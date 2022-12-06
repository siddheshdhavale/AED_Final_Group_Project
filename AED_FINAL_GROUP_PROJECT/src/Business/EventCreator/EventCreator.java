/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EventCreator;
import Business.TaskQueue.TaskQueue;
/**
 *
 * @author yashrevadekar
 */
public class EventCreator {
    private String name;
    private String id;
    private TaskQueue taskQueue;
    
    private static int count=1;
    //Event creator class constructor
     public EventCreator(){
         
        id= "EC"+(++count);
        taskQueue=new TaskQueue();
    }

    public TaskQueue getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     @Override
     public String toString(){
         return name;
     }
}
