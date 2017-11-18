package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class DesktopPcPage extends CommonCatalogPage {
    private static By DESKTOP_PC_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public DesktopPcPage() {
        super();
    }

    public DesktopPcPage isDesktopPcPageOpened () {
        Assert.assertTrue(driver.findElement(DESKTOP_PC_PAGE_TITLE).getText().contains("Компьютеры"));
        return new DesktopPcPage();
    }
}
