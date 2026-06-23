package com.transflower;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Serilization {

    public void serilize(){
        String filePath = System.getProperty("user.dir") + File.separator + "Employee.ser";
        try{
            System.out.println("Serialization will write to: " + filePath);
            Employee emp = new Employee(1,"rutaaa",50000);
            try (FileOutputStream file = new FileOutputStream(filePath);
                 ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(emp);
            }

            File f = new File(filePath);

            System.out.println("object serilized sucessfully");
            System.out.println("File Created : " + f.exists());
            System.out.println("File Location : " + f.getAbsolutePath());

        }catch(Exception e ){
              e.printStackTrace();
        }
    }
}