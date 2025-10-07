package com.transflower.TflAssessmentTesting;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    private static WebDriver driver;

    @BeforeMethod
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://127.0.0.1:5500/Home.html");
    }

    @Test
    public void testHome(){

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login"))).click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("password"));
        email.sendKeys("sumit.bhor@example.com");  
        password.sendKeys("12345");
         Assert.assertEquals("sumit.bhor@example.com",email.getDomProperty("value"));
        Assert.assertEquals("12345", password.getDomProperty("value"));
        driver.findElement(By.cssSelector("button[type='submit']")).click();
       
        System.out.println("user logged in:");

        wait.until(ExpectedConditions.urlContains("Student/student.html"));
        
        driver.findElement(By.linkText("Get All Test")).click();

        driver.findElement(By.xpath("//button[@class='detailsBtn' and contains(@data-test,'Independence test')]")).click();

         
    }

    
    // @AfterMethod
    // public static void teardown(){
    //     if(driver!=null){
    //         driver.quit();
    //     }
    // }
    
}
