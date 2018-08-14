package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by Englich on 11.11.2017.
 */
public class TestData {
    private WebDriver driver = null;
    private Log log = new Log();
    private static final String URL_MAIN_PAGE = "https://catalog.onliner.by/";
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void initDriver(WebDriver driver) {
        log.info("Start WebDriver");
        setDriver(driver);
    }

    public void stopDriver() {
        log.info("Stop WebDriver");
        driver.quit();
    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D://automation/chromedriver.exe");
        driver = new ChromeDriver();
        initDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.get(URL_MAIN_PAGE);
    }

    @AfterMethod
    public void tearDown() {
        stopDriver();
    }
}
