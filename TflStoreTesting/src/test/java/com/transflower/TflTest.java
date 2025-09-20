package com.transflower;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TflTest {
    private static WebDriver driver;
    
    @BeforeAll
    static void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://localhost:8000/index.html");
    }
    @Test
    void testTflstore()
    {
        WebElement gallery = driver.findElement(By.id("galleryLink"));
        gallery.click();
        try{
        Thread.sleep(1000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }


        String afterclickgallery = driver.getCurrentUrl();
        System.out.println(afterclickgallery);

        assertTrue(afterclickgallery.contains("catalog.html"), afterclickgallery);
             try{
        Thread.sleep(1000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

       WebElement jasmine=driver.findElement(By.id("1"));
       jasmine.click();
        try{
        Thread.sleep(1000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        String clickbtn=driver.getCurrentUrl();
        System.out.println(clickbtn);

         assertTrue(clickbtn.contains("details.html"),clickbtn);
         
        WebElement addcartbtn=driver.findElement(By.id("click"));
        System.out.println(addcartbtn.getText());
        addcartbtn.click();
          try{
        Thread.sleep(1000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        

        String addcart=driver.getCurrentUrl();
        System.out.println(addcart);
       assertTrue(addcart.contains("cart.html"),addcart);
        
        try{
        Thread.sleep(1000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
      
        WebElement productidentifier=driver.findElement(By.id("txtid"));
        productidentifier.sendKeys("8");

         try{
        Thread.sleep(1000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        WebElement productquantity=driver.findElement(By.id("txtquantity"));
        productquantity.sendKeys("2");
         try{
        Thread.sleep(1000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        WebElement addtocartbtn=driver.findElement(By.id("addCartbtn"));
        addtocartbtn.click();
        try{
        Thread.sleep(2000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }


    }
    @AfterAll
    static void teardown() {
        if (driver != null) {
            driver.quit();
        }
}
}