/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class EmployeeDir {
    private ArrayList<Employee> employeeList;
    
    public EmployeeDir(){
        employeeList=new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    //create a new employee 
    public Employee createEmployee(String name){
        Employee emp= new Employee();
        emp.setName(name);
        employeeList.add(emp);
        return emp;
    }
}
