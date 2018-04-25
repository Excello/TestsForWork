package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class HeaterPage extends CommonCatalogPage{
    private static By HEATER_PAGE_TITLE = By.cssSelector(".schema-header__title");
    CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(driver);
    CommonCatalogPage commonCatalogPage = new CommonCatalogPage(driver);

    public HeaterPage(WebDriver driver) {
        super(driver);
    }

    public HeaterPage checkCatalogPageIsOpened() {
        catalogNavigatorPage.goToHeaterPage();
        Assert.assertTrue(driver.findElement(HEATER_PAGE_TITLE).getText().contains("Обогреватели"));
        commonCatalogPage.isProductsDisplayed();
        commonCatalogPage.isFilterSectionDisplayed();
        commonCatalogPage.isAnyFilterExisted();
        return new HeaterPage(driver);
    }
}
