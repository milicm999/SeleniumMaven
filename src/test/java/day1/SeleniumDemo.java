package day1;

import com.sun.org.apache.bcel.internal.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\milicm\\OneDrive - Comtrade Group\\Desktop\\QA assignment_Marija_Milic\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");

        System.out.println(driver.getTitle());
        //Verifying title
        if(driver.getTitle().equals("Welcome: Mercury Tours"))
            System.out.println("Title verfied");
        else
            System.out.println("Verifying title test failed.");


        //Testing LogIn
        WebElement username=driver.findElement(By.name("userName"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("userName")));
        username.sendKeys(Keys.COMMAND + "maja99");
        WebElement password= driver.findElement(By.name("password"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("password")));
        password.sendKeys(Keys.COMMAND + "maja99");
        WebElement submit= driver.findElement(By.name("submit"));
        submit.click();

        System.out.println(driver.getTitle());

        if(driver.getTitle().equals("Login: Mercury Tours"))
            System.out.println("Log in was successful, test pass");
        else
            System.out.println("Log in failed, test failed");

    }
}


