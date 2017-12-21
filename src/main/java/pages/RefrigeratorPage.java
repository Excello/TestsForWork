package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class RefrigeratorPage extends CommonCatalogPage {
    private static By REFRIGERATOR_PAGE_TITLE = By.cssSelector(".schema-header__title");
    CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(driver);
    CommonCatalogPage commonCatalogPage = new CommonCatalogPage(driver);

    public RefrigeratorPage(WebDriver driver) {
        super(driver);
    }

    public RefrigeratorPage checkCatalogPageIsOpened() {
        catalogNavigatorPage.goToRefrigeratorPage();
        Assert.assertTrue(driver.findElement(REFRIGERATOR_PAGE_TITLE).getText().contains("Холодильники"));
        commonCatalogPage.isProductsDisplayed();
        commonCatalogPage.isFilterSectionDisplayed();
        commonCatalogPage.isAnyFilterExisted();
        return new RefrigeratorPage(driver);
    }
}
