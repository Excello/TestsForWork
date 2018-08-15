package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public abstract class BaseCatalogProductsPage extends BasePage {
    private static final By COMMON_CATALOG_PAGE_ITEMS = By.id("schema-products");
    private static final By COMMON_CATALOG_FILTERS = By.id("schema-filter");
    private static final By COMMON_CATALOG_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public BaseCatalogProductsPage(By identifyElementLocator, WebDriver d) {
        super(identifyElementLocator, d);
    }

    //TODO Вот этот метод можно же залить просто в BasePage, нет? - done


    public BaseCatalogProductsPage isProductsDisplayed() {
        try {
            Assert.assertTrue(getDriver().findElement(COMMON_CATALOG_PAGE_ITEMS).isDisplayed());
            getLog().info("Products were displayed");
            return this;
        } catch (NoSuchElementException e) {
            getLog().warn("Products were not displayed");
            return null;
        }
    }

    public BaseCatalogProductsPage isFilterSectionDisplayed() {
        try {
            Assert.assertTrue(getDriver().findElement(COMMON_CATALOG_FILTERS).isDisplayed());
            getLog().info("Filter section was displayed");
            return this;
        } catch (NoSuchElementException e) {
            getLog().warn("Filter section was not displayed");
            return null;
        }
    }

    public BaseCatalogProductsPage isAnyFilterExisted() {
        try {
            Assert.assertTrue(getDriver().findElement(COMMON_CATALOG_PAGE_ANY_FILTER).isDisplayed());
            getLog().info("Any filter was displayed");
            return this;
        } catch (NoSuchElementException e) {
            getLog().warn("Any filter was not displayed");
            return null;
        }
    }
}
