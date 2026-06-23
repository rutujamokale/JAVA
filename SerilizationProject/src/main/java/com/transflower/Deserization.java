package com.transflower;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class  Deserization{
    public void deserilize(){
        try{

            String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "Employee.ser";
            FileInputStream file = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(file);
            Employee emp = (Employee) in.readObject();
            in.close();
            file.close();
             
             System.out.println(emp);

        }catch(Exception e){
            e.printStackTrace();

        }
    }
}