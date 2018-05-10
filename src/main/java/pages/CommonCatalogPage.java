package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class CommonCatalogPage {

    //TODO Зачем создавать эту пустую и нерабочую реализацию???
    public WebDriver driver = new WebDriver() {
        @Override
        public void get(String s) { }

        @Override
        public String getCurrentUrl() {
            return null;
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public List<WebElement> findElements(By by) {
            return null;
        }

        @Override
        public WebElement findElement(By by) {
            return null;
        }

        @Override
        public String getPageSource() {
            return null;
        }

        @Override
        public void close() { }

        @Override
        public void quit() { }

        @Override
        public Set<String> getWindowHandles() {
            return null;
        }

        @Override
        public String getWindowHandle() {
            return null;
        }

        @Override
        public TargetLocator switchTo() {
            return null;
        }

        @Override
        public Navigation navigate() {
            return null;
        }

        @Override
        public Options manage() {
            return null;
        }
    };
    private static By COMMON_CATALOG_PAGE_ITEMS = By.id("schema-products");
    private static By COMMON_CATALOG_FILTERS = By.id("schema-filter");
    private static By COMMON_CATALOG_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public CommonCatalogPage(WebDriver driver) {
        this.driver = driver;
    }

     public CommonCatalogPage isProductsDisplayed () {
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ITEMS).isDisplayed());
        return new CommonCatalogPage(driver);
    }

    public CommonCatalogPage isFilterSectionDisplayed () {
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_FILTERS).isDisplayed());
        return new CommonCatalogPage(driver);
    }

    public CommonCatalogPage isAnyFilterExisted () {
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ANY_FILTER).isDisplayed());
        return new CommonCatalogPage(driver);
    }
}
