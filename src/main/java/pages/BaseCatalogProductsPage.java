package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

abstract public class BaseCatalogProductsPage extends BasePage{
    private final By COMMON_CATALOG_PAGE_ITEMS = By.id("schema-products");
    private final By COMMON_CATALOG_FILTERS = By.id("schema-filter");
    private final By COMMON_CATALOG_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public BaseCatalogProductsPage(By identifyElementLocator, WebDriver d) {
        super(identifyElementLocator, d);
    }

    @Override
    public boolean isPageOpened() {
        try {
            WebElement pageTitle = getDriver().findElement(getIdentifyElementLocator());
            Assert.assertTrue(pageTitle.isDisplayed());
            System.out.println("Page was displayed");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Page was not displayed");
            return false;
        }
    }

    public BaseCatalogProductsPage isProductsDisplayed(){
        try {
            Assert.assertTrue(getDriver().findElement(COMMON_CATALOG_PAGE_ITEMS).isDisplayed());
            System.out.println("Products were displayed");
            return this;
        } catch (NoSuchElementException e) {
            System.out.println("Products were not displayed");
            return null;
        }
    }

    public BaseCatalogProductsPage isFilterSectionDisplayed(){
        try {
            Assert.assertTrue(getDriver().findElement(COMMON_CATALOG_FILTERS).isDisplayed());
            System.out.println("Filter section was displayed");
            return this;
        } catch (NoSuchElementException e) {
            System.out.println("Filter section was not displayed");
            return null;
        }
    }

    public BaseCatalogProductsPage isAnyFilterExisted(){
        try {
            Assert.assertTrue(getDriver().findElement(COMMON_CATALOG_PAGE_ANY_FILTER).isDisplayed());
            System.out.println("Any filter was displayed");
            return this;
        } catch (NoSuchElementException e) {
            System.out.println("Any filter was not displayed");
            return null;
        }
    }
}
