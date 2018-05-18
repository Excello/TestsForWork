package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class CommonCatalogPage {

    //TODO Зачем создавать эту пустую и нерабочую реализацию???
    private WebDriver driver = null;

    public WebDriver getDriver() {
        driver = new ChromeDriver();
        return driver;
    }


    private static By COMMON_CATALOG_PAGE_ITEMS = By.id("schema-products");
    private static By COMMON_CATALOG_FILTERS = By.id("schema-filter");
    private static By COMMON_CATALOG_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public CommonCatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public CommonCatalogPage isPageOpened(String pageName){
        switch (pageName) {
            case "BicyclePage" : Assert.assertTrue(driver.findElement(BICYCLE_PAGE_TITLE).getText().contains("Велосипеды"));
                break;
            case "VideoCardPage" : VideoCardPage videoCardPage = catalogNavigatorPage.goToVideoCardPage();
                break;
            case "HeadphonesPage" : HeadphonesPage headphonesPage = catalogNavigatorPage.goToHeadphonesPage();
                break;
            case "StrollersPage" : StrollersPage strollersPage = catalogNavigatorPage.goToStrollersPage();
                break;
            case "MobilePage" : MobilePage mobilePage = catalogNavigatorPage.goToMobilePage();
                break;
            case "NotebookPage" : NotebookPage notebookPage = catalogNavigatorPage.goToNotebookPage();
                break;
            case "PhotoPage" : PhotoPage photoPage = catalogNavigatorPage.goToPhotoPage();
                break;
            case "MotorOilPage" : MotorOilPage motorOilPage = catalogNavigatorPage.goToMotorOilPage();
                break;
            case "TabletPcPage" : TabletPcPage tabletPcPage = catalogNavigatorPage.goToTabletPcPage();
                break;
            case "TiresPage" : TiresPage tiresPage = catalogNavigatorPage.goToTiresPage();
                break;
            case "SmartWatchPage" : SmartWatchPage smartWatchPage = catalogNavigatorPage.goToSmartWatchPage();
                break;
        }
            case:
    }

     public CommonCatalogPage isProductsDisplayed(){
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ITEMS).isDisplayed());
        return new CommonCatalogPage(driver);
    }

    public CommonCatalogPage isFilterSectionDisplayed(){
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_FILTERS).isDisplayed());
        return new CommonCatalogPage(driver);
    }

    public CommonCatalogPage isAnyFilterExisted(){
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ANY_FILTER).isDisplayed());
        return new CommonCatalogPage(driver);
    }
}
