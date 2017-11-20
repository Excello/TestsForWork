package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class MobilePage extends CommonCatalogPage {
    private static By MOBILE_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public MobilePage(WebDriver driver) {
        super(driver);
    }

    public MobilePage isMobilePageOpened () {
        Assert.assertTrue(driver.findElement(MOBILE_PAGE_TITLE).getText().contains("Мобильные телефоны"));
        return new MobilePage(driver);
    }
}
