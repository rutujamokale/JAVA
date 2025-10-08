package com.transflower.TflAssessmentTesting;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminTest {
    private static WebDriver driver;
    @BeforeMethod
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://127.0.0.1:5500/Home.html");
        
    }
    @Test
    public void AdminTest(){
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login"))).click();

        WebElement email=driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("password"));

        email.sendKeys("ravi.tambade@example.com");
        password.sendKeys("12345");

        Assert.assertEquals("ravi.tambade@example.com", email.getDomProperty("value"));
        Assert.assertEquals("12345", password.getDomProperty("value"));    
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 

        wait.until(ExpectedConditions.urlContains("http://127.0.0.1:5500/Admin/admin.html"));

        WebElement AssignTest=driver.findElement(By.id("showTestBtw"));
        AssignTest.click();

        WebElement fromDate=driver.findElement(By.id("fromDate"));
        fromDate.sendKeys("08102025");

        WebElement toDate=driver.findElement(By.id("toDate"));
        toDate.sendKeys("09102025");


        WebElement GetTests=driver.findElement(By.xpath("//button[contains(text(),'Get Tests')]"));
        GetTests.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@onclick='updateTest(14)']")));
        WebElement updatestatus=driver.findElement(By.xpath("//button[@onclick='updateTest(14)']"));
        updatestatus.click();

        WebElement selectstatus= driver.findElement(By.id("statusDropdown"));
        Select status=new Select(selectstatus);
        status.selectByVisibleText("Scheduled");

        WebElement changestatus=driver.findElement(By.id("changeStatus"));
        changestatus.click();
         try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         Alert alert = driver.switchTo().alert();
        alert.accept();


        WebElement getstudents=driver.findElement(By.id("getStudents"));
        getstudents.click();
         try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement sumitstudents=driver.findElement(By.cssSelector(("input[value='4']")));
        sumitstudents.click();
         try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


  
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("let el=document.getElementById('scheduledStart'); el.value='2025-10-09T10:00'; el.dispatchEvent(new Event('change'));");


         try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("let el=document.getElementById('scheduledEnd'); el.value='2025-10-10T12:00'; el.dispatchEvent(new Event('change'));");


         try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       WebElement Remarks=driver.findElement(By.id("remarks"));
       Remarks.sendKeys("please attend the test");

        try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       WebElement addStudents=driver.findElement(By.id("addStudent"));
       addStudents.click();
        try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


       Alert alert1 = driver.switchTo().alert();
        alert1.accept();
         try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
         }
    }

    @AfterMethod
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
