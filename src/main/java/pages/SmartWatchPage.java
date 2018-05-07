package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class SmartWatchPage extends CommonCatalogPage{
    private static By SMART_WATCH_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public SmartWatchPage(WebDriver driver) {
        super(driver);
    }

    public SmartWatchPage isSmartWatchPageOpened() {
        Assert.assertTrue(driver.findElement(SMART_WATCH_PAGE_TITLE).getText().contains("Умные часы и браслеты"));
        return new SmartWatchPage(driver);
    }
}
