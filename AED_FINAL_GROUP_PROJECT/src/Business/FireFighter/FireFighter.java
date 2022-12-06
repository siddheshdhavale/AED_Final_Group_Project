/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FireFighter;
import Business.TaskQueue.TaskQueue;
/**
 *
 * @author yashrevadekar
 */
public class FireFighter {
    private String Name;
    private static int Count=1;
    private String FireFighterId;
    private TaskQueue taskQueue;
    //Fire fighter constructor which automatically generates id
    public FireFighter() {
        
        FireFighterId = "FireFighter"+(++Count);
        taskQueue= new TaskQueue();
    }
    
    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        FireFighter.Count = Count;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFireFighterId() {
        return FireFighterId;
    }

    public void setFireFighterId(String FireFighterId) {
        this.FireFighterId = FireFighterId;
    }

    public TaskQueue getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }
       
    
        @Override
    public String toString(){
        return Name;
    }
}
