package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class DesktopPcPage extends CommonCatalogPage {
    private static By DESKTOP_PC_PAGE_TITLE = By.cssSelector(".schema-header__title");
    CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(driver);
    CommonCatalogPage commonCatalogPage = new CommonCatalogPage(driver);

    public DesktopPcPage(WebDriver driver) {
        super(driver);
    }

    public DesktopPcPage checkCatalogPageIsOpened() {
        catalogNavigatorPage.goToDesktopPcPage();
        Assert.assertTrue(driver.findElement(DESKTOP_PC_PAGE_TITLE).getText().contains("Компьютеры"));
        commonCatalogPage.isProductsDisplayed();
        commonCatalogPage.isFilterSectionDisplayed();
        commonCatalogPage.isAnyFilterExisted();
        return new DesktopPcPage(driver);
    }
}
