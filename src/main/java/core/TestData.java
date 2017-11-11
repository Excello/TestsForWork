package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Englich on 11.11.2017.
 */
public class TestData {
    public static WebDriver driver;
    private static final String URL_MAIN_PAGE = "catalog.onliner.by";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_MAIN_PAGE);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
