/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Cops;
import Business.TaskQueue.TaskQueue;
/**
 *
 * @author yashrevadekar
 */
public class Cops {
    private String Name;
    private static int Count=1;
    private String CopsId;
    private TaskQueue taskQueue;
    //Police class constructor to autogenerate id
    public Cops() {
        
        CopsId = "Cops"+(++Count);
        taskQueue= new TaskQueue();
    }
    
    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        Cops.Count = Count;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCopsId() {
        return CopsId;
    }

    public void setCopsId(String CopsId) {
        this.CopsId = CopsId;
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
