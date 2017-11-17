package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonCatalogPage {
    public static WebDriver driver;
    private static By COMMON_CATALOG_PAGE_ITEMS = By.id("schema-products");
    private static By COMMON_CATALOG_FILTERS = By.id("schema-filter");
    private static By COMMON_CATALOG_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public CommonCatalogPage() {
    }

    public CommonCatalogPage isProductsDisplayed () {
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ITEMS).isDisplayed());
        return new CommonCatalogPage();
    }

    public CommonCatalogPage isFilterSectionDisplayed () {
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_FILTERS).isDisplayed());
        return new CommonCatalogPage();
    }

    public CommonCatalogPage isAnyFilterExisted () {
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ANY_FILTER).isDisplayed());
        return new CommonCatalogPage();
    }
}
