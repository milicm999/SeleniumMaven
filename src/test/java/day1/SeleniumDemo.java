package day1;

import com.google.common.annotations.VisibleForTesting;
import com.sun.org.apache.bcel.internal.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;


public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

//
//        public void validationOfTitle()
//        {
//            setUpTestEnvironment test1=new setUpTestEnvironment();
//            WebDriver driver= test1.getDriver();
//            WebDriverWait wait1=test1.getWait1();
//
//            System.out.println(driver.getTitle());
//            //Verifying title
//            if(driver.getTitle().equals("Welcome: Mercury Tours"))
//                System.out.println("Title verfied");
//            else
//                System.out.println("Verifying title test failed.");
//            driver.quit();
//        }
//        setUpTestEnvironment test1=new setUpTestEnvironment();
//        WebDriver driver= test1.getDriver();
//        WebDriverWait wait1=test1.getWait1();
//
//        System.out.println(driver.getTitle());
//        //Verifying title
//        if(driver.getTitle().equals("Welcome: Mercury Tours"))
//            System.out.println("Title verfied");
//        else
//            System.out.println("Verifying title test failed.");
//        driver.quit();
//
//        //Testing LogIn with valid information
//        setUpTestEnvironment test2=new setUpTestEnvironment();
//        WebDriver driver2= test1.getDriver();
//        WebDriverWait wait2=test1.getWait1();
//        driver2.wait(5);
//        WebElement username=test2.findElement("userName");
//        wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("userName")));
//        username.sendKeys(Keys.COMMAND + "maja99");
//        WebElement password= driver2.findElement(By.name("password"));
//        wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("password")));
//        password.sendKeys(Keys.COMMAND + "maja99");
//        WebElement submit= driver2.findElement(By.name("submit"));
//        wait2.until(ExpectedConditions.elementToBeClickable(submit));
//        submit.click();
//
//        System.out.println(driver.getTitle());
//
//        if(driver.getTitle().equals("Login: Mercury Tours"))
//            System.out.println("Log in was successful, test pass");
//        else
//            System.out.println("Log in failed, test failed");
//
//        driver.quit();
//
//        //Testing log in with no information
//        setUpTestEnvironment test3=new setUpTestEnvironment();
//        WebDriver driver3=test2.getDriver();
//        WebDriverWait wait3=test2.getWait1();
//
////        WebElement signOffButton=driver.findElement(By.linkText("SIGN-OFF"));
////        wait1.until(ExpectedConditions.elementToBeClickable(signOffButton)).click();
////        wait1.until(ExpectedConditions.titleIs("Welcome: Mercury Tours"));
//        System.out.println("Testing logIn with no information");
//        wait3.until(ExpectedConditions.elementToBeClickable(submit));
//        submit.click();
//
//        if(driver3.getTitle().equals("Login: Mercury Tours"))
//            System.out.println("User should not be allowed to log in without entering username and password \n , test failed");
//        else
//            System.out.println("Test is successful, user cannot log in");


    }
}


