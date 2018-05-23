package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {
    //TODO Зачем создавать эту пустую и нерабочую реализацию??? [Done]
    public WebDriver driver = null;

    private static By BASE_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By COMMON_CATALOG_PAGE_ITEMS = By.id("schema-products");
    private static By COMMON_CATALOG_FILTERS = By.id("schema-filter");
    private static By COMMON_CATALOG_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void isPageOpened(String pageName){

        switch (pageName) {
            case "BicyclePage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Велосипеды"));
                break;
            case "VideoCardPage" :Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Видеокарты"));
                break;
            case "HeadphonesPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Наушники и гарнитуры"));
                break;
            case "StrollersPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Детские коляски"));
                break;
            case "MobilePage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Мобильные телефоны"));
                break;
            case "NotebookPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Ноутбуки"));
                break;
            case "PhotoPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Фотоаппараты"));
                break;
            case "MotorOilPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Моторные масла"));
                break;
            case "TabletPcPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Планшеты"));
                break;
            case "TiresPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Автомобильные шины"));
                break;
            case "SmartWatchPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Умные часы и браслеты"));
                break;
        }
    }

     public BasePage isProductsDisplayed(){
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ITEMS).isDisplayed());
        return new BasePage(driver);
    }

    public BasePage isFilterSectionDisplayed(){
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_FILTERS).isDisplayed());
        return new BasePage(driver);
    }

    public BasePage isAnyFilterExisted(){
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ANY_FILTER).isDisplayed());
        return new BasePage(driver);
    }
}
