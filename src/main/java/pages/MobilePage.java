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
    CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(driver);
    CommonCatalogPage commonCatalogPage = new CommonCatalogPage(driver);

    public MobilePage(WebDriver driver) {
        super(driver);
    }

    public MobilePage checkCatalogPageIsOpened() {
        catalogNavigatorPage.goToMobilePage();
        Assert.assertTrue(driver.findElement(MOBILE_PAGE_TITLE).getText().contains("Мобильные телефоны"));
        commonCatalogPage.isProductsDisplayed();
        commonCatalogPage.isFilterSectionDisplayed();
        commonCatalogPage.isAnyFilterExisted();
        return new MobilePage(driver);
    }
}
