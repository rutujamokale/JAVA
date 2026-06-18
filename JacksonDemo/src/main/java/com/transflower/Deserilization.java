package com.transflower;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Deserilization{

    public void deserialize(){    
    try{    
    ObjectMapper mapper=new ObjectMapper();

    Employee emp=mapper.readValue(new File("employee.json"),Employee.class);

    System.out.println(emp.getId());
    System.out.println(emp.getName());
    System.out.println(emp.getSalary());


    }catch(Exception e){
        e.printStackTrace();
    }

    }
    }


