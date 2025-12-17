package com.transflower.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        double billAmount=12000;
        DiscountService ds=new DiscountService();
        double finalAmount=ds.calculatefinalamount(billAmount);
        System.out.println("final amount is:"+finalAmount);
        System.out.println("bill amount is:"+billAmount);
      
    }
}
