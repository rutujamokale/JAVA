package com.transflower;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registrationTest {
    private static WebDriver driver;

    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5501/src/Webpages/registration.html");
    }

    @Test
    void testRegistrationForm() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement phone = driver.findElement(By.id("phone"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement confirm = driver.findElement(By.id("confirm"));
        WebElement female = driver.findElement(By.id("female"));
        WebElement dob = driver.findElement(By.id("dob"));
        WebElement address = driver.findElement(By.id("address"));
        Select course = new Select(driver.findElement(By.id("course")));
        WebElement btn = driver.findElement(By.tagName("button")); 

        try{
            username.sendKeys("rutuja");
            Thread.sleep(2000);
            email.sendKeys("rutujamokale@gmail.com");
            Thread.sleep(2000);

            phone.sendKeys("9545107220");
            Thread.sleep(2000);

            password.sendKeys("rutuja@123");
            Thread.sleep(2000);

            
            confirm.sendKeys("rutuja@123");
            Thread.sleep(2000);

            female.click();
            Thread.sleep(2000);

            dob.sendKeys("2003-06-22"); 
            Thread.sleep(2000);

            address.sendKeys("Pune");
            Thread.sleep(2000);

            course.selectByValue("java");
            Thread.sleep(2000);

            btn.click();
         }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement msg = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("welcomeMsg"))
        );

        String expected = "welcome rutuja";
        assertTrue(msg.getText().contains(expected));
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
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
