package com.transflower;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int[] arr = { 10, 20, 30, 40 };
        // int Max = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > Max) {
        //         Max = arr[i];
        //     }
        // }

        int Min = arr[0];
        for (int x : arr) {
            if (x < Min)
                Min = x;
        }
        
        System.out.println("min value" + Min);
        
        
        
        
        
        
        
        // Circle c=new Circle();
        // Rectangle r=new Rectangle();

        // c.draw();
        // c.show();

        // r.draw();
        // r.show();

        // Student s1=new Student();

        //    //setter

        //    s1.setName("rutuja");
        //    s1.setRoll_no(28);
        //    s1.setmarks(90);

        //    System.out.println("name:"+ s1.getName());
        //    System.out.println("roll_no:" +s1.getRoll_no());
        //    System.out.println("marks:" + s1.getMarks());

        // Student s1=new Student("nikita",29,90.5f);

        // System.out.println(s1);

    }
}
