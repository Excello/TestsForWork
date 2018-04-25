package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class DisplayPage extends CommonCatalogPage {
    private static By DISPLAY_PAGE_TITLE = By.cssSelector(".schema-header__title");

    DisplayPage(WebDriver driver) {
        super(driver);
    }

    public DisplayPage isDisplayPageOpened() {
        Assert.assertTrue(driver.findElement(DISPLAY_PAGE_TITLE).getText().contains("Мониторы"));
        return new DisplayPage(driver);
    }
}
