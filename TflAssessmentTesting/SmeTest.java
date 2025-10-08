package com.transflower.TflAssessmentTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmeTest {
    private static WebDriver driver;

    @BeforeMethod
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://127.0.0.1:5500/Home.html");
        
    }

    @Test
    public void SmeTest(){
        try{
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login"))).click();

        WebElement email=driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("password"));

        email.sendKeys("nirjala.naik@example.com");
        password.sendKeys("12345");

        Assert.assertEquals("nirjala.naik@example.com", email.getDomProperty("value"));
        Assert.assertEquals("12345", password.getDomProperty("value"));    
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
        
        wait.until(ExpectedConditions.urlContains("http://127.0.0.1:5500/SME/sme.html"));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Get Subject and Criteria via Questions"))).click();

      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSubjects")));
      WebElement dropdown = driver.findElement(By.id("ddlSubjects"));
      Select select = new Select(dropdown);
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ddlSubjects"), "DOTNET"));
      select.selectByVisibleText("DOTNET");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSubjects")));


      driver.findElement(By.linkText("Create Test")).click();
      Thread.sleep(1000);

      WebElement testName=driver.findElement(By.id("testName"));
      testName.sendKeys("Advance java test");
      Thread.sleep(1000);
      System.out.println("************************The test name is filled********************");


      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("duration")));
      WebElement duration=driver.findElement(By.id("duration"));
      duration.sendKeys("00:30:00");
      Thread.sleep(1000);
      System.out.println("*********************The duration is filled ******************************");

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subjectSelect")));
       WebElement dropdown1 = driver.findElement(By.id("subjectSelect"));
       Select select1 = new Select(dropdown1);
       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("subjectSelect"), "ADVJAVA"));
       select1.selectByVisibleText("ADVJAVA");
       
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("smeSelect")));
        WebElement dropdown2=driver.findElement(By.id("smeSelect"));
        Select select2=new Select(dropdown2);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("smeSelect"), "kajal ghule"));
        select2.selectByVisibleText("kajal ghule");  

      WebElement date = driver.findElement(By.id("scheduledDate"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("scheduledDate")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '2025-10-08T11:00';" +
                                                    "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
                                                    "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",date);

     WebElement PassingLevel=driver.findElement(By.id("passingLevel"));
     PassingLevel.sendKeys("6");

     
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("questionsList")));
      WebElement questions=driver.findElement(By.id("questionsList"));

      List<WebElement> checkboxes = questions.findElements(By.tagName("input"));
      

         for(WebElement question: checkboxes){
            question.click();
        }

        Thread.sleep(1000);
        WebElement submitButton = driver.findElement(By.id("submitBtn"));
        submitButton.click();


        Thread.sleep(1000);

        wait.until(ExpectedConditions.urlContains("SME/reviewtest.html"));
        WebElement confirmButton = driver.findElement(By.id("confirmBtn"));

        confirmButton.click();
    }catch(Exception e){
        System.out.println("e");
    }

        }
    }
    

