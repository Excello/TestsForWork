package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class StrollersPage extends CommonCatalogPage{
    private static By STROLLERS_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public StrollersPage(WebDriver driver) {
        super(driver);
    }

    public StrollersPage isHeaterPageOpened() {
        Assert.assertTrue(driver.findElement(STROLLERS_PAGE_TITLE).getText().contains("Детские коляски"));
        return new StrollersPage(driver);
    }
}
