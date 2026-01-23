package com.transflower.project;

public class App {
  // public static int fib(int n){
  //     if(n==0)
  //       return 0;
  //     if(n==1)
  //       return 1;
  //     return fib(n-1) + fib (n-2);

  // } 

  public static void main(String[] args) {

    abstract class vehicle {
      abstract void start();
    }

    class car extends vehicle {

      @Override
      void start() {
        System.out.println("car start with key");
      }
    }

  }
}
         // print all element of array

        //  int[] arr = { 10, 20, 30, 40 };

         // for (int i = 0; i < arr.length; i++) {
         //   System.out.print(arr[i] + " ");
         // }

         //sum of array

         // int sum = 0;

         // for (int x : arr) {
         //   sum += x;
         // }

         // System.out.println(sum);

         // largest element in array

         // int max = arr[0];
         // for (int i = 1; i < arr.length; i++) {
         //   if (arr[i] > max)
         //     max = arr[i];
         // }
         // System.out.println(max);

      //    int min = arr[0];
      //    for (int x : arr) {
      //      if (x < min)
      //        min = x;
      //    }
         
          //  System.out.println(min);

      //  }
    
    
                
         
                          // int b=1;
        // for(int i=1;i<=5;i++){
        //   System.out.println(a + "");
        //   int c= a+b;
        //   a=b;
        //   b=c;
        // }


      // int [] arr={10,20,30,40};
      // int first= arr[0];
      // int second =arr[0];

      // for(int i =1 ; i< arr.length;i++){
      //   if(arr[i]>first){
      //     second=first;
      //     first=arr[i];


      //   }else if(arr[i]> second && arr[i] !=first){
      //     second = arr [i];
      //   }
      // }

      // System.out.println("second largest=" +second);

      //]  int[] arr = {50, 5, 25, 3, 75};
      //  int max = arr[0];

      //  for(int n:arr){
     //   if(n>max){
      //     max=n;
      //   }
      //  }

      //  System.out.println("Maximum value: " + max);

      

      // String s="madam";
      // String rev= "";

      // for(int i=s.length() -1;i>=0;i--){
      //   rev +=s.charAt(i);
      // }

      // if(s.equals(rev)){
      //     System.out.println("palindrome");
      // }else{
      //   System.out.println("not palindrome");
      // }




      // String str="java";
      // Map<Character,Integer> map = new HashMap<>();

      // for(char c:str.toCharArray()){
      //   map.put(c,map.getOrDefault(c,0)+1);
      // }

      // System.out.println(map);


      // int arr[] ={1,2,2,3};

      // Map<Integer,Boolean> map=new HashMap<>();
      // for(int n: arr){
      //   map.put(n,true);
      // }
      // System.out.println(map);


      // String s="Rutuja";
      // char [] arr = s.toCharArray();

      // for(int i=arr.length -1 ;i>=0; i--){
      //   System.out.println(arr[i]);
      // }


      // EmployeeService  service = new EmployeeService();
      // service.addEmployee(new Employee(1,"Rupesh",50000));
      //  service.addEmployee(new Employee(2,"Rahil",40000));
      //   service.addEmployee(new Employee(3,"Rehan",70000));

      //   service.ApplySalaryHike();

      //   Employee e= service.getHighestpaidEmployee();

      //   System.out.println("highest paid:" + e.name + " -" + e.salary);

    
  




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
