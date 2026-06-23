package com.transflower;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Serilization implements Serializable{

    public void serilize(){
        try{

            Employee emp = new Employee(1,"rutaaa"50000);

            FileOutputStream file= new FileOutputStream("Employee.json");
            ObjectOutputStream out = new  ObjectOutputStream(file);
            out.writeObject(emp);
            out.close();
            file.close();

            System.out.pritln("object serilized sucessfully");

        }catch(Exception e ){
              e.printStackTrace();  
        }
    }
}