package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogNavigatorPage extends BasePage {
    private static By MOBILE_PAGE_TAB = By.linkText("Мобильные телефоны");
    private static By TABLET_PC_PAGE_TAB = By.linkText("Планшеты");
    private static By NOTEBOOK_PAGE_TAB = By.linkText("Ноутбуки");
    private static By SMART_WATCH_PAGE_TAB = By.linkText("Умные часы и браслеты");
    private static By PHOTO_PAGE_TAB = By.linkText("Фотоаппараты");
    private static By TIRES_PAGE_TAB = By.linkText("Автомобильные шины");
    private static By MOTOR_OIL_PAGE_TAB = By.linkText("Моторные масла");
    private static By STROLLERS_PAGE_TAB = By.linkText("Детские коляски");
    private static By VIDEO_CARD_PAGE_TAB = By.linkText("Видеокарты");
    private static By HEADPHONES_PAGE_TAB = By.linkText("Наушники и гарнитуры");
    private static By BICYCLE_PAGE_TAB = By.linkText("Велосипеды");

    public CatalogNavigatorPage(By identifyElementLocator, WebDriver d) {
        super(identifyElementLocator, d);
    }

    @Override
    public boolean isPageOpened(WebDriver driver, By identifyElementLocator) {
        try {
            Assert.assertTrue(driver.findElement(identifyElementLocator).getText().contains("Каталог"));
            System.out.println("Catalog page was displayed");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Catalog page was not displayed");
            return false;
        }
    }

    public void goToMobilePage() {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public void goToTabletPcPage() {
        driver.findElement(TABLET_PC_PAGE_TAB).click();
    }

    public void goToNotebookPage() {
        getDriver().findElement(NOTEBOOK_PAGE_TAB).click();
    }

    public void goToSmartWatchPage() {
        getDriver().findElement(SMART_WATCH_PAGE_TAB).click();
    }

    public void goToPhotoPage() {
        getDriver().findElement(PHOTO_PAGE_TAB).click();
    }

    public void goToTiresPage() {
        getDriver().findElement(TIRES_PAGE_TAB).click();
    }

    public void goToMotorOilPage() {
        getDriver().findElement(MOTOR_OIL_PAGE_TAB).click();
    }

    public void goToStrollersPage() {
        getDriver().findElement(STROLLERS_PAGE_TAB).click();
    }

    public void goToVideoCardPage() {
        getDriver().findElement(VIDEO_CARD_PAGE_TAB).click();
    }

    public void goToHeadphonesPage() {
        getDriver().findElement(HEADPHONES_PAGE_TAB).click();
    }

    public void goToBicyclePage() {
        getDriver().findElement(BICYCLE_PAGE_TAB).click();
    }
}
