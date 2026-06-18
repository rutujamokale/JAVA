package com.transflower;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

import java.io.File;


public class Serilization1{

    public void serilize(){

        try{
        List<Employee> employees=new ArrayList<>();
          employees.add(new Employee (1,"rutaa",50000));  
          employees.add(new Employee (2,"rina",60000)); 
          employees.add(new Employee (3,"rohan",70000)); 
          employees.add(new Employee (4,"rushi",80000)); 
          employees.add(new Employee (5,"reyansh",90000)); 


            ObjectMapper mapper=new ObjectMapper();
            mapper.writeValue(new File("employee.json"),employees);
            System.out.println("writing data in json file");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}