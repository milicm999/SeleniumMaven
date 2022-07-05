package day1;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class Testing {

    @AfterEach
    public void waitToFinish() throws InterruptedException {
        wait(10);
    }

    @Test
    public void validationOfTitle()
    {
        setUpTestEnvironment test1=new setUpTestEnvironment();
        WebDriver driver= test1.getDriver();
        WebDriverWait wait1=test1.getWait1();

        System.out.println(driver.getTitle());
        //Verifying title
        assertEquals("Welcome: Mercury Tours",driver.getTitle());
        driver.quit();


    }

    @Test
    public void testLogInWithValidInfo()
    {
        setUpTestEnvironment test2=new setUpTestEnvironment();
        WebDriver driver2= test2.getDriver();
        WebDriverWait wait2=test2.getWait1();
        WebElement username=test2.findElement("userName");
        wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("userName")));
        username.sendKeys(Keys.COMMAND + "maja99");
        WebElement password= driver2.findElement(By.name("password"));
        wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("password")));
        password.sendKeys(Keys.COMMAND + "maja99");
        WebElement submit= driver2.findElement(By.name("submit"));
        wait2.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();

        System.out.println(driver2.getTitle());
        assertEquals("Login: Mercury Tours",driver2.getTitle());
        driver2.quit();
    }

    @Test
    public void testLogInWithNoInfo()
    {
        setUpTestEnvironment test3=new setUpTestEnvironment();
        WebDriver driver3=test3.getDriver();
        WebDriverWait wait3=test3.getWait1();

//        WebElement signOffButton=driver.findElement(By.linkText("SIGN-OFF"));
//        wait1.until(ExpectedConditions.elementToBeClickable(signOffButton)).click();
//        wait1.until(ExpectedConditions.titleIs("Welcome: Mercury Tours"));
        System.out.println("Testing logIn with no information");
        WebElement submit=driver3.findElement(By.name("submit"));
        wait3.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();

        assertEquals("Welcome: Mercury Tours",driver3.getTitle());
    }
}
