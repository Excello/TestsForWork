package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//TODO Этот класс должен быть абстрактным - done
public abstract class BasePage {

    public final WebDriver driver;

    private static By BASE_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By COMMON_CATALOG_PAGE_ITEMS = By.id("schema-products");
    private static By COMMON_CATALOG_FILTERS = By.id("schema-filter");
    private static By COMMON_CATALOG_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");
    private final By identifyElementLocator;

    protected BasePage(By identifyElementLocator, WebDriver driver) {
        this.driver = driver;
        this.identifyElementLocator = identifyElementLocator;
    }
    //TODO Нет. В класс добавить private final By identifyElementLocator; Сделать конструктор: protected BasePage(By, WebDriver)
    private By isPageOpened(By identifyElementLocator) {
        switch (identifyElementLocator) {
            case identifyElementLocator = By.className("asdas"); : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Велосипеды"));
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
        return identifyElementLocator;
    }

    public void isProductsDisplayed(){
        Assert.assertTrue(driver.findElement(COMMON_CATALOG_PAGE_ITEMS).isDisplayed());
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
