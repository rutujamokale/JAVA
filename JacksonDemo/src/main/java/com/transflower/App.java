package com.transflower;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Before serialize");
       Serilization s1=new Serilization();
       s1.serialize();

        System.out.println("After serialize");

       Deserilization d1=new Deserilization();
       System.out.println("Before deserialize");

       d1.deserialize();
    }
}
