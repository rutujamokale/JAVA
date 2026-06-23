package com.transflower;
import com.transflower.Serilization;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Serilization s1 = new Serilization();
        s1.serilize();

        Deserization d1 = new Deserization();
        d1.deserilize();
    }
}
