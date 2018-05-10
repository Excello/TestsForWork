package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class TabletPcPage extends CommonCatalogPage {
    private static By TABLET_PC_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public TabletPcPage(WebDriver driver) {
        super(driver);
    }

    public TabletPcPage isTabletPcPageOpened() {
        Assert.assertTrue(driver.findElement(TABLET_PC_PAGE_TITLE).getText().contains("Планшеты"));
        return new TabletPcPage(driver);
    }
}
