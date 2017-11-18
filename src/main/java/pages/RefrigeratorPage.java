package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class RefrigeratorPage extends CommonCatalogPage {
    private static By REFRIGERATOR_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public RefrigeratorPage() {
        super();
    }

    public RefrigeratorPage isRefrigeratorPageOpened () {
        Assert.assertTrue(driver.findElement(REFRIGERATOR_PAGE_TITLE).getText().contains("Холодильники"));
        return new RefrigeratorPage();
    }
}
