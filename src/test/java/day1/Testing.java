package day1;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

        System.out.println("Testing logIn with no information");
        WebElement submit=driver3.findElement(By.name("submit"));
        wait3.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();

        assertEquals("Welcome: Mercury Tours",driver3.getTitle());
        driver3.quit();
    }
    @Test
    public void testRegistrationWithValidInfo() throws IOException
    {
        setUpTestEnvironment test4=new setUpTestEnvironment();
        WebDriver driver=test4.getDriver();
        WebDriverWait wait=test4.getWait1();
        JavascriptExecutor js= test4.getJs();

        List<WebElement> registers = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(@href,'register.php')]")));
        registers.get(0).click();

        wait.until(ExpectedConditions.titleIs("Register: Mercury Tours"));
        WebElement firstName=driver.findElement(By.name("firstName"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
        firstName.sendKeys(Keys.COMMAND,"Marija");

        WebElement lastName=driver.findElement(By.name("lastName"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("lastName")));
        lastName.sendKeys(Keys.COMMAND,"Milic");

        WebElement phone=driver.findElement(By.name("phone"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("phone")));
        phone.sendKeys(Keys.COMMAND,"06025238456");



        WebElement email=driver.findElement(By.name("userName"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("userName")));
        email.sendKeys(Keys.COMMAND,"marija999milic@yahoo.com");


        js.executeScript("window.scrollBy(0, 956)", "");


        WebElement address=driver.findElement(By.name("address1"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("address1")));
        address.sendKeys(Keys.COMMAND,"Karadjordjeva 2");

        WebElement city=driver.findElement(By.name("city"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("city")));
        city.sendKeys(Keys.COMMAND,"Kragujevac");

        WebElement province=driver.findElement(By.name("state"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("state")));
        province.sendKeys(Keys.COMMAND,"Sumadija");

        WebElement postalCode=driver.findElement(By.name("postalCode"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("postalCode")));
        postalCode.sendKeys(Keys.COMMAND,"34000");

        Select selectCountry=new Select(driver.findElement(By.name("country")));
        selectCountry.selectByVisibleText("SERBIA");

        WebElement userName=driver.findElement(By.name("email"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("email")));
        userName.sendKeys(Keys.COMMAND,"maja99");

        WebElement password=driver.findElement(By.name("password"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("password")));
        password.sendKeys(Keys.COMMAND,"maja99");

        WebElement confirmPassword=driver.findElement(By.name("confirmPassword"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("confirmPassword")));
        confirmPassword.sendKeys(Keys.COMMAND,"maja99");

        WebElement submit=driver.findElement(By.name("submit"));
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();


        assertEquals("https://demo.guru99.com/test/newtours/register_sucess.php",driver.getCurrentUrl());

        driver.quit();

    }
}
