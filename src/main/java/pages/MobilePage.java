package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class MobilePage extends CommonCatalogPage {
    private static By MOBILE_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public MobilePage() {
        super();
    }

    public MobilePage isMobilePageOpened () {
        Assert.assertTrue(driver.findElement(MOBILE_PAGE_TITLE).getText().contains("Мобильные телефоны"));
        return new MobilePage();
    }
}
