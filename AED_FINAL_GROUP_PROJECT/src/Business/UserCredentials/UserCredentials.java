/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserCredentials;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.TaskQueue.TaskQueue;
/**
 *
 * @author siddh
 */
public class UserCredentials {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private TaskQueue taskQueue;
    
    
    public UserCredentials(){
        taskQueue = new TaskQueue();
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public TaskQueue getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }
    
    @Override
    public String toString(){
        return username;
    }
}
