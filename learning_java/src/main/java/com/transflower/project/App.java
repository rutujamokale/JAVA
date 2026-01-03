package com.transflower.project;

import java.util.ArrayList;
import java.util.List;

import com.transflower.project.entities.Employee;
import com.transflower.project.entities.Student1;

public class App 
{
    public static void main( String[] args )
    {

        List<Student1> students=new ArrayList<>();

          students.add(new Student1(1, "Rutuja", 85.5));
          students.add(new Student1(2,"Reena",90.5));
          students.add(new Student1(3,"Prathmesh",80.5));


          System.out.println("display all list");

          for(Student1 s:students){
            s.display();
          }

          System.out.println("\n student at index 1:");
          students.get(1).display();

          students.remove(2);



            
        };


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

