/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDir;
import Business.Role.Role;
import Business.TaskQueue.TaskQueue;
import Business.UserCredentials.UserCredentialsDir;
import java.util.HashSet;

/**
 *
 * @author yashrevadekar
 */
public abstract class Organization {

    private String name;
    private String orgName;
    private TaskQueue taskQueue;
    private EmployeeDir employeeDir;
    private UserCredentialsDir userCredentialsDir;
    private int organizationCode;
    private static int count = 1;
    public HashSet<Role> role;

    //enums for types of organization
    public enum Type {
        Victim("Victim Organization"),
        EventCreator("EventCreator Organization"),
        Volunteer("Volunteer Organization"),
        CSO("CSO Organization"),
        Supplier("Supplier"),
        Doctor("Doctor"),
        Cops("Cops"),
        FireFighter("FireFighter");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    //constructor to update work queues, employee directory and user account

    public Organization(String name) {
        this.name = name;
        taskQueue = new TaskQueue();
        employeeDir = new EmployeeDir();
        userCredentialsDir = new UserCredentialsDir();

        organizationCode = count;
        role = new HashSet<>();
        ++count;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public abstract HashSet<Role> getSupportedRole();

    public UserCredentialsDir getUserCredentialsDir() {
        return userCredentialsDir;
    }

    public void setUserCredentialsDir(UserCredentialsDir userCredentialsDirectory) {
        this.userCredentialsDir = userCredentialsDirectory;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organization.count = count;
    }

    public HashSet<Role> getRole() {
        return role;
    }

    public void setRole(HashSet<Role> role) {
        this.role = role;
    }

    public EmployeeDir getEmployeeDir() {
        return employeeDir;
    }

    public void setEmployeeDir(EmployeeDir employeeDirectory) {
        this.employeeDir = employeeDirectory;
    }

    public int getOrganizationCode() {
        return organizationCode;
    }

    public TaskQueue getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
