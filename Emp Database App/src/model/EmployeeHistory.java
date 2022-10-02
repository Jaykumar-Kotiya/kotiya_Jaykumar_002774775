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
    
    private ArrayList<Product> history;
    
    public EmployeeHistory() {
        this.history = new ArrayList<Product>();
    }

    public ArrayList<Product> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Product> history) {
        this.history = history;
    }
    
    public Product addNewEmployee() {
        
        Product newEmployees = new Product();
        history.add(newEmployees);
        return newEmployees;
    }
    
}
