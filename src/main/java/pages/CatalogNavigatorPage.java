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
            WebElement pageTitle = driver.findElement(By.cssSelector(".catalog-navigation__title"));
            Assert.assertTrue(pageTitle.getText().contains("Каталог"));
            System.out.println("Catalog page was displayed");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Catalog page was not displayed");
            return false;
        }
    }

    public MobilePage goToMobilePage() {
        driver.findElement(MOBILE_PAGE_TAB).click();
        System.out.println("Mobile page is opening");
        return new MobilePage(By.cssSelector(".schema-header__title"), driver);
    }

    public TabletPcPage goToTabletPcPage() {
        driver.findElement(TABLET_PC_PAGE_TAB).click();
        System.out.println("TabletPc page is opening");
        return new TabletPcPage(By.cssSelector(".schema-header__title"), driver);
    }

    public NotebookPage goToNotebookPage() {
        driver.findElement(NOTEBOOK_PAGE_TAB).click();
        System.out.println("Notebook page is opening");
        return new NotebookPage(By.cssSelector(".schema-header__title"), driver);
    }

    public SmartWatchPage goToSmartWatchPage() {
        driver.findElement(SMART_WATCH_PAGE_TAB).click();
        System.out.println("SmartWatch page is opening");
        return new SmartWatchPage(By.cssSelector(".schema-header__title"), driver);
    }

    public PhotoPage goToPhotoPage() {
        driver.findElement(PHOTO_PAGE_TAB).click();
        System.out.println("Photo page is opening");
        return new PhotoPage(By.cssSelector(".schema-header__title"), driver);
    }

    public TiresPage goToTiresPage() {
        driver.findElement(TIRES_PAGE_TAB).click();
        System.out.println("Tires page is opening");
        return new TiresPage(By.cssSelector(".schema-header__title"), driver);
    }

    public MotorOilPage goToMotorOilPage() {
        driver.findElement(MOTOR_OIL_PAGE_TAB).click();
        System.out.println("MotorOil page is opening");
        return new MotorOilPage(By.cssSelector(".schema-header__title"), driver);
    }

    public StrollersPage goToStrollersPage() {
        driver.findElement(STROLLERS_PAGE_TAB).click();
        System.out.println("Strollers page is opening");
        return new StrollersPage(By.cssSelector(".schema-header__title"), driver);
    }

    public VideoCardPage goToVideoCardPage() {
        driver.findElement(VIDEO_CARD_PAGE_TAB).click();
        System.out.println("VideoCard page is opening");
        return new VideoCardPage(By.cssSelector(".schema-header__title"), driver);
    }

    public HeadphonesPage goToHeadphonesPage() {
        driver.findElement(HEADPHONES_PAGE_TAB).click();
        System.out.println("Headphones page is opening");
        return new HeadphonesPage(By.cssSelector(".schema-header__title"), driver);
    }

    public BicyclePage goToBicyclePage() {
        driver.findElement(BICYCLE_PAGE_TAB).click();
        System.out.println("Bicycle page is opening");
        return new BicyclePage(By.cssSelector(".schema-header__title"), driver);
    }
}
