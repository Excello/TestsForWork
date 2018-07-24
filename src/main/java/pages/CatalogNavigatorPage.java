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

    public MobilePage goToMobilePage() {
        driver.findElement(MOBILE_PAGE_TAB).click();
        return new MobilePage(By.className("SmartWatchPage"), driver);
    }

    public TabletPcPage goToTabletPcPage() {
        driver.findElement(TABLET_PC_PAGE_TAB).click();
        return new TabletPcPage(By.className("TabletPcPage"), driver);
    }

    public NotebookPage goToNotebookPage() {
        getDriver().findElement(NOTEBOOK_PAGE_TAB).click();
        return new NotebookPage(By.className("SmartWatchPage"), getDriver());
    }

    public SmartWatchPage goToSmartWatchPage() {
        getDriver().findElement(SMART_WATCH_PAGE_TAB).click();
        return new SmartWatchPage(By.className("SmartWatchPage"), getDriver());
    }

    public PhotoPage goToPhotoPage() {
        getDriver().findElement(PHOTO_PAGE_TAB).click();
        return new PhotoPage(By.className("SmartWatchPage"), getDriver());
    }

    public TiresPage goToTiresPage() {
        getDriver().findElement(TIRES_PAGE_TAB).click();
        return new TiresPage(By.className("SmartWatchPage"), getDriver());
    }

    public MotorOilPage goToMotorOilPage() {
        getDriver().findElement(MOTOR_OIL_PAGE_TAB).click();
        return new MotorOilPage(By.className("SmartWatchPage"), getDriver());
    }

    public StrollersPage goToStrollersPage() {
        getDriver().findElement(STROLLERS_PAGE_TAB).click();
        return new StrollersPage(By.className("SmartWatchPage"), getDriver());
    }

    public VideoCardPage goToVideoCardPage() {
        getDriver().findElement(VIDEO_CARD_PAGE_TAB).click();
        return new VideoCardPage(By.className("SmartWatchPage"), getDriver());
    }

    public HeadphonesPage goToHeadphonesPage() {
        getDriver().findElement(HEADPHONES_PAGE_TAB).click();
        return new HeadphonesPage(By.className("SmartWatchPage"), getDriver());
    }

    public BicyclePage goToBicyclePage() {
        getDriver().findElement(BICYCLE_PAGE_TAB).click();
        return new BicyclePage(By.className("SmartWatchPage"), getDriver());
    }
}
