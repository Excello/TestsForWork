package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


/**
 * Created by Englich on 11.11.2017.
 *
 */
public class BicyclePage extends CommonCatalogPage{
    private static By BICYCLE_PAGE_TITLE = By.cssSelector(".schema-header__title");

    BicyclePage(WebDriver driver) {
        super(driver);
    }

    public BicyclePage isActionCameraPageOpened() {
        Assert.assertTrue(driver.findElement(BICYCLE_PAGE_TITLE).getText().contains("Велосипеды"));
        return new BicyclePage(driver);
    }
}
