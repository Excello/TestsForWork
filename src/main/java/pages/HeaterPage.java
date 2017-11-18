package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class HeaterPage extends CommonCatalogPage{
    private static By HEATER_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public HeaterPage() {
        super();
    }

    public HeaterPage isHeaterPageOpened () {
        Assert.assertTrue(driver.findElement(HEATER_PAGE_TITLE).getText().contains("Обогреватели"));
        return new HeaterPage();
    }
}
