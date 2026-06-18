package com.transflower;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import java.io.File;

public class Deserilization1{
    public void deserialize(){
        try{

            ObjectMapper mapper=new ObjectMapper();

            List<Employee> employees=mapper.readValue(new File("employee.json"),new TypeReference<List<Employee>>(){});

            for(Employee emp :employees){
                System.out.println(emp);
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
