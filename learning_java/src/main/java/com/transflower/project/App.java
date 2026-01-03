package com.transflower.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.transflower.project.entities.Employee;
import com.transflower.project.entities.EmployeeService;
import com.transflower.project.entities.Student1;

public class App 
{
    public static void main( String[] args )
    {

      String str="java";
      Map<Character,Integer> map = new HashMap<>();

      for(char c:str.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
      }

      System.out.println(map);

      // EmployeeService  service = new EmployeeService();
      // service.addEmployee(new Employee(1,"Rupesh",50000));
      //  service.addEmployee(new Employee(2,"Rahil",40000));
      //   service.addEmployee(new Employee(3,"Rehan",70000));

      //   service.ApplySalaryHike();

      //   Employee e= service.getHighestpaidEmployee();

      //   System.out.println("highest paid:" + e.name + " -" + e.salary);

    }





        // List<Student1> students=new ArrayList<>();

        //   students.add(new Student1(1, "Rutuja", 85.5));
        //   students.add(new Student1(2,"Reena",90.5));
        //   students.add(new Student1(3,"Prathmesh",80.5));


        //   System.out.println("display all list");

        //   for(Student1 s:students){
        //     s.display();
        //   }

        //   System.out.println("\n student at index 1:");
        //   students.get(1).display();

        //   students.remove(2);



            
        //  };


        // Scanner sc=new Scanner(System.in);
        // studentService ss=new studentService();

        // while (true){
        //     System.out.println("\n 1.add student");
        //      System.out.println("\n 2.  view student");
        //       System.out.println("\n 3. exit");
        //        System.out.println("choose option");

        //        int choice=sc.nextInt();

        //        switch(choice){
        //         case 1:
        //             System.out.println("enter ID: ");
        //             int id=sc.nextInt();
        //             sc.nextLine();

        //             System.out.println("enter name:") ;
        //             String name=sc.nextLine();


        //             System.out.println("enter a marks:");
        //             int marks=sc.nextInt();


        //             ss.addStudent(new Student(id,name,marks));
        //             System.out.println("student added sucessfully");
        //             break;




        //             case 2:
        //                 ss.displayStudent();
        //                 break;


        //             case 3:
                        
        //             System.out.println("existing application");
        //             sc.close();
        //             return;


        //             default:

        //             System.out.println("invalid choice");


        //        }
        // }
        
        
        

        // double billAmount=12000;
        // DiscountService ds=new DiscountService();
        // double finalAmount=ds.calculatefinalamount(billAmount);
        // System.out.println("final amount is:"+finalAmount);
        // System.out.println("bill amount is:"+billAmount);
      


    }

