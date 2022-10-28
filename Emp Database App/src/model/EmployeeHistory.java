/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jkoti
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> history;
    // created constructer to store new data
    public EmployeeHistory() {
        this.history = new ArrayList<Employee>();
    }
    //created constructer to get data and set data
    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
   //method to store which will called in createjpanel 
    public Employee addNewEmployee() {
        
        Employee newEmployees = new Employee();
        history.add(newEmployees);
        return newEmployees;
    }

   public void deleteEmployees(Employee vs){
       history.remove(vs);
   }
    
}
