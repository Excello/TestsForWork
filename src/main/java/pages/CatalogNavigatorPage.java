package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public boolean isPageOpened() {
        try {
            WebElement pageTitle = getDriver().findElement(By.cssSelector(".catalog-navigation__title"));
            Assert.assertTrue(pageTitle.getText().contains("Каталог"));
            System.out.println("Catalog page was displayed");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Catalog page was not displayed");
            return false;
        }
    }

    public MobilePage goToMobilePage() {
        getDriver().findElement(MOBILE_PAGE_TAB).click();
        System.out.println("Mobile page is opening");
        return new MobilePage(getIdentifyElementLocator(), getDriver());//TODO By.cssSelector(".schema-header__title") передается во все страницы = дублирование кода
    }

    public TabletPcPage goToTabletPcPage() {
        getDriver().findElement(TABLET_PC_PAGE_TAB).click();
        System.out.println("TabletPc page is opening");
        return new TabletPcPage(getIdentifyElementLocator(), getDriver());
    }

    public NotebookPage goToNotebookPage() {
        getDriver().findElement(NOTEBOOK_PAGE_TAB).click();
        System.out.println("Notebook page is opening");
        return new NotebookPage(getIdentifyElementLocator(), getDriver());
    }

    public SmartWatchPage goToSmartWatchPage() {
        getDriver().findElement(SMART_WATCH_PAGE_TAB).click();
        System.out.println("SmartWatch page is opening");
        return new SmartWatchPage(getIdentifyElementLocator(), getDriver());
    }

    public PhotoPage goToPhotoPage() {
        getDriver().findElement(PHOTO_PAGE_TAB).click();
        System.out.println("Photo page is opening");
        return new PhotoPage(getIdentifyElementLocator(), getDriver());
    }

    public TiresPage goToTiresPage() {
        getDriver().findElement(TIRES_PAGE_TAB).click();
        System.out.println("Tires page is opening");
        return new TiresPage(getIdentifyElementLocator(), getDriver());
    }

    public MotorOilPage goToMotorOilPage() {
        getDriver().findElement(MOTOR_OIL_PAGE_TAB).click();
        System.out.println("MotorOil page is opening");
        return new MotorOilPage(getIdentifyElementLocator(), getDriver());
    }

    public StrollersPage goToStrollersPage() {
        getDriver().findElement(STROLLERS_PAGE_TAB).click();
        System.out.println("Strollers page is opening");
        return new StrollersPage(getIdentifyElementLocator(), getDriver());
    }

    public VideoCardPage goToVideoCardPage() {
        getDriver().findElement(VIDEO_CARD_PAGE_TAB).click();
        System.out.println("VideoCard page is opening");
        return new VideoCardPage(getIdentifyElementLocator(), getDriver());
    }

    public HeadphonesPage goToHeadphonesPage() {
        getDriver().findElement(HEADPHONES_PAGE_TAB).click();
        System.out.println("Headphones page is opening");
        return new HeadphonesPage(getIdentifyElementLocator(), getDriver());
    }

    public BicyclePage goToBicyclePage() {
        getDriver().findElement(BICYCLE_PAGE_TAB).click();
        System.out.println("Bicycle page is opening");
        return new BicyclePage(getIdentifyElementLocator(), getDriver());
    }
}
