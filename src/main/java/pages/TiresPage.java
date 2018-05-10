package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class TiresPage extends CommonCatalogPage {
    private static By TIRES_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public TiresPage(WebDriver driver) {
        super(driver);
    }

    public TiresPage isTiresPageOpened() {
        Assert.assertTrue(driver.findElement(TIRES_PAGE_TITLE).getText().contains("Автомобильные шины"));
        return new TiresPage(driver);
    }
}
