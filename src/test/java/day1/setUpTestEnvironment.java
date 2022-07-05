package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class setUpTestEnvironment {

    private WebDriver driver;
    private ChromeOptions options;
    private DesiredCapabilities capabilities;
    private WebDriverWait wait1;

    public setUpTestEnvironment()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\milicm\\OneDrive - Comtrade Group\\Desktop\\QA assignment_Marija_Milic\\chromedriver.exe");
        options=new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
        capabilities=new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver=new ChromeDriver();
        wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public ChromeOptions getOptions() {
        return options;
    }

    public void setOptions(ChromeOptions options) {
        this.options = options;
    }

    public DesiredCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(DesiredCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public WebDriverWait getWait1() {
        return wait1;
    }

    public void setWait1(WebDriverWait wait1) {
        this.wait1 = wait1;
    }
    public WebElement findElement(String nameOfElement)
    {
        WebElement element=driver.findElement(By.name(nameOfElement));
        return element;
    }
}
