package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogNavigatorPage extends CommonCatalogPage{
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

    public CatalogNavigatorPage(WebDriver driver) {
        super(driver);
    }

    public MobilePage goToMobilePage() {
        driver.findElement(MOBILE_PAGE_TAB).click();
        return new MobilePage(driver);
    }

    public TabletPcPage goToTabletPcPage() {
        driver.findElement(TABLET_PC_PAGE_TAB).click();
        return new TabletPcPage(driver);
    }

    public NotebookPage goToNotebookPage() {
        driver.findElement(NOTEBOOK_PAGE_TAB).click();
        return new NotebookPage(driver);
    }

    public SmartWatchPage goToSmartWatchPage()
    {
        driver.findElement(SMART_WATCH_PAGE_TAB).click();
        return new SmartWatchPage(driver);
    }

    public PhotoPage goToPhotoPage()
    {
        driver.findElement(PHOTO_PAGE_TAB).click();
        return new PhotoPage(driver);
    }

    public TiresPage goToTiresPage() {
        driver.findElement(TIRES_PAGE_TAB).click();
        return new TiresPage(driver);
    }

    public MotorOilPage goToMotorOilPage() {
        driver.findElement(MOTOR_OIL_PAGE_TAB).click();
        return new MotorOilPage(driver);
    }

    public StrollersPage goToStrollersPage() {
        driver.findElement(STROLLERS_PAGE_TAB).click();
        return new StrollersPage(driver);
    }

    public VideoCardPage goToVideoCardPage() {
        driver.findElement(VIDEO_CARD_PAGE_TAB).click();
        return new VideoCardPage(driver);
    }

    public HeadphonesPage goToHeadphonesPage() {
        driver.findElement(HEADPHONES_PAGE_TAB).click();
        return new HeadphonesPage(driver);
    }

    public BicyclePage goToBicyclePage() {
        driver.findElement(BICYCLE_PAGE_TAB).click();
        return new BicyclePage(driver);
    }
}
