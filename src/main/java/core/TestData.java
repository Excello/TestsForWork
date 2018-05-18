package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Englich on 11.11.2017.
 */
public class TestData {
    //TODO Зачем создавать эту пустую и нерабочую реализацию???
    //FIX: Done
    private WebDriver driver = null;

    public WebDriver getDriver() {
        return driver;
    }

    private static final String URL_MAIN_PAGE = "https://catalog.onliner.by/";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D://automation/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.get(URL_MAIN_PAGE);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
