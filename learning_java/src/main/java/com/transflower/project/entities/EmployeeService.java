package com.transflower.project.entities  ;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    
    List<Employee> employees= new ArrayList<>();

    public void addEmployee(Employee e){
        employees.add(e);
    }


    public void  ApplySalaryHike(){
        for(Employee e :employees){
           if( e.salary <50000)
           {
                e.salary=e.salary +(e.salary * 0.10);
           }            
           }
        }

        public void getHighestpaidEmployee(){
            
        } 

    }

