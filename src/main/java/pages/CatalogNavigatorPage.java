package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 */
public class CatalogNavigatorPage extends BasePage {
    private static final By MOBILE_PAGE_TAB = By.linkText("Мобильные телефоны");
    private static final By TABLET_PC_PAGE_TAB = By.linkText("Планшеты");
    private static final By NOTEBOOK_PAGE_TAB = By.linkText("Ноутбуки");
    private static final By SMART_WATCH_PAGE_TAB = By.linkText("Умные часы и браслеты");
    private static final By PHOTO_PAGE_TAB = By.linkText("Фотоаппараты");
    private static final By TIRES_PAGE_TAB = By.linkText("Автомобильные шины");
    private static final By MOTOR_OIL_PAGE_TAB = By.linkText("Моторные масла");
    private static final By STROLLERS_PAGE_TAB = By.linkText("Детские коляски");
    private static final By VIDEO_CARD_PAGE_TAB = By.linkText("Видеокарты");
    private static final By HEADPHONES_PAGE_TAB = By.linkText("Наушники и гарнитуры");
    private static final By BICYCLE_PAGE_TAB = By.linkText("Велосипеды");

    public CatalogNavigatorPage(By identifyElementLocator, WebDriver d) {
        super(identifyElementLocator, d);
    }

    public MobilePage goToMobilePage() {
        getDriver().findElement(MOBILE_PAGE_TAB).click();
        getLog().info("Mobile page is opening");
        return new MobilePage(getIdentifyElementLocator(), getDriver());
    }

    public TabletPcPage goToTabletPcPage() {
        getDriver().findElement(TABLET_PC_PAGE_TAB).click();
        getLog().info("TabletPc page is opening");
        return new TabletPcPage(getIdentifyElementLocator(), getDriver());
    }

    public NotebookPage goToNotebookPage() {
        getDriver().findElement(NOTEBOOK_PAGE_TAB).click();
        getLog().info("Notebook page is opening");
        return new NotebookPage(getIdentifyElementLocator(), getDriver());
    }

    public SmartWatchPage goToSmartWatchPage() {
        getDriver().findElement(SMART_WATCH_PAGE_TAB).click();
        getLog().info("SmartWatch page is opening");
        return new SmartWatchPage(getIdentifyElementLocator(), getDriver());
    }

    public PhotoPage goToPhotoPage() {
        getDriver().findElement(PHOTO_PAGE_TAB).click();
        getLog().info("Photo page is opening");
        return new PhotoPage(getIdentifyElementLocator(), getDriver());
    }

    public TiresPage goToTiresPage() {
        getDriver().findElement(TIRES_PAGE_TAB).click();
        getLog().info("Tires page is opening");
        return new TiresPage(getIdentifyElementLocator(), getDriver());
    }

    public MotorOilPage goToMotorOilPage() {
        getDriver().findElement(MOTOR_OIL_PAGE_TAB).click();
        getLog().info("MotorOil page is opening");
        return new MotorOilPage(getIdentifyElementLocator(), getDriver());
    }

    public StrollersPage goToStrollersPage() {
        getDriver().findElement(STROLLERS_PAGE_TAB).click();
        getLog().info("Strollers page is opening");
        return new StrollersPage(getIdentifyElementLocator(), getDriver());
    }

    public VideoCardPage goToVideoCardPage() {
        getDriver().findElement(VIDEO_CARD_PAGE_TAB).click();
        getLog().info("VideoCard page is opening");
        return new VideoCardPage(getIdentifyElementLocator(), getDriver());
    }

    public HeadphonesPage goToHeadphonesPage() {
        getDriver().findElement(HEADPHONES_PAGE_TAB).click();
        getLog().info("Headphones page is opening");
        return new HeadphonesPage(getIdentifyElementLocator(), getDriver());
    }

    public BicyclePage goToBicyclePage() {
        getDriver().findElement(BICYCLE_PAGE_TAB).click();
        getLog().info("Bicycle page is opening");
        return new BicyclePage(getIdentifyElementLocator(), getDriver());
    }
}
