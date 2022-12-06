/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TaskQueue;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class TaskQueue {
    
    private ArrayList<TaskRequest> taskRequestList;
    
    public TaskQueue(){
        taskRequestList=new ArrayList<>();
    }

    public ArrayList<TaskRequest> getTaskRequestList() {
        return taskRequestList;
    }
    
    
}