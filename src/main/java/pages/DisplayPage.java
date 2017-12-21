package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class DisplayPage extends CommonCatalogPage {
    private static By DISPLAY_PAGE_TITLE = By.cssSelector(".schema-header__title");
    CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(driver);
    CommonCatalogPage commonCatalogPage = new CommonCatalogPage(driver);

    public DisplayPage(WebDriver driver) {
        super(driver);
    }

    public DisplayPage checkCatalogPageIsOpened() {
        catalogNavigatorPage.goToDisplayPage();
        Assert.assertTrue(driver.findElement(DISPLAY_PAGE_TITLE).getText().contains("Мониторы"));
        commonCatalogPage.isProductsDisplayed();
        commonCatalogPage.isFilterSectionDisplayed();
        commonCatalogPage.isAnyFilterExisted();
        return new DisplayPage(driver);
    }
}
