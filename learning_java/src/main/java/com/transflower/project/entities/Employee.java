package com.transflower.project.entities ;

public class Employee {
    
    private int id;
    private String name;
    public double salary;


    public Employee(){

    }

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
}
