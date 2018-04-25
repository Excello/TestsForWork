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
    private static By TV_PAGE_TAB = By.linkText("Телевизоры");
    private static By PHOTO_PAGE_TAB = By.linkText("Фотоаппараты");
    private static By TIRES_PAGE_TAB = By.linkText("Автомобильные шины");
    private static By REFRIGERATOR_PAGE_TAB = By.linkText("Холодильники");
    private static By HEATER_PAGE_TAB = By.linkText("Обогреватели");
    private static By DISPLAY_PAGE_TAB = By.linkText("Мониторы");
    private static By HEADPHONES_PAGE_TAB = By.linkText("Наушники и гарнитуры");
    private static By DESKTOP_PC_PAGE_TAB = By.linkText("Компьютеры");
    private static By ACTION_CAMERA_PAGE_TAB = By.linkText("Экшен-камеры");

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

    public TvPage goToTvPage()
    {
        driver.findElement(TV_PAGE_TAB).click();
        return new TvPage(driver);
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

    public RefrigeratorPage goToRefrigeratorPage() {
        driver.findElement(REFRIGERATOR_PAGE_TAB).click();
        return new RefrigeratorPage(driver);
    }

    public HeaterPage goToHeaterPage() {
        driver.findElement(HEATER_PAGE_TAB).click();
        return new HeaterPage(driver);
    }

    public DisplayPage goToDisplayPage() {
        driver.findElement(DISPLAY_PAGE_TAB).click();
        return new DisplayPage(driver);
    }

    public HeadphonesPage goToHeadphonesPage() {
        driver.findElement(HEADPHONES_PAGE_TAB).click();
        return new HeadphonesPage(driver);
    }

    public DesktopPcPage goToDesktopPcPage() {
        driver.findElement(DESKTOP_PC_PAGE_TAB).click();
        return new DesktopPcPage(driver);
    }

    public ActionCameraPage goToActionCameraPage() {
        driver.findElement(ACTION_CAMERA_PAGE_TAB).click();
        return new ActionCameraPage(driver);
    }
}
