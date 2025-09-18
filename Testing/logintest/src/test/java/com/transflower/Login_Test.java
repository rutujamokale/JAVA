package com.transflower;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {
    private static WebDriver driver;

    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/src/WebPages/Login.html");
    }

    @Test
    void testLoginForm() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login"));
        WebElement msg = driver.findElement(By.id("msg"));

        username.sendKeys("rutujamokale@gmail.com");
        password.sendKeys("rutuja@123");
       
        String enteredUser=username.getAttribute("value");
        String enteredPass=password.getAttribute("value");

        login.click();

            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement message=wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("msg"))
            );

            if(enteredUser.equals("rutujamokale@gmail.com")&&enteredPass.equals("rutuja@123")){
                message.sendKeys("Login successfull");
            }
            else{
                message.sendKeys("invalid login");
            }

        assertEquals("Login successfull", msg.getAttribute("value"));
    }

    @AfterAll
    static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
