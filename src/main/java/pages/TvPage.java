package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class TvPage extends CommonCatalogPage{
    private static By TV_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public TvPage() {
        super();
    }

    public TvPage isTvPageOpened () {
        Assert.assertTrue(driver.findElement(TV_PAGE_TITLE).getText().contains("Телевизоры"));
        return new TvPage();
    }
}
