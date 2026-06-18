package com.transflower;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Before serialize");
       Serilization1 s1=new Serilization1();
       s1.serilize();

        System.out.println("After serialize");

       Deserilization1 d1=new Deserilization1();
       System.out.println("Before deserialize");

       d1.deserialize();
    }
}
