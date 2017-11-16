package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogNavigatorPage {
    private WebDriver driver;
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
 /* Impossible to find on page
    private static By PRINTERS_PAGE_TAB = By.linkText("Принтеры и МФУ");
    private static By PARFUME_PAGE_TAB = By.linkText("Парфюмерия");
    private static By HOUSE_PAGE_TAB = By.linkText("Дома, коттеджи");*/

    public CatalogNavigatorPage() {
    }

    public MobilePage goToMobilePage() {
        driver.findElement(MOBILE_PAGE_TAB).click();
        return new MobilePage();
    }

    public TabletPcPage goToTabletPcPage() {
        driver.findElement(TABLET_PC_PAGE_TAB).click();
        return new TabletPcPage();
    }

    public NotebookPage goToNotebookPage() {
        driver.findElement(NOTEBOOK_PAGE_TAB).click();
        return new NotebookPage();
    }

    public TvPage goToTvPage()
    {
        driver.findElement(TV_PAGE_TAB).click();
        return new TvPage();
    }

    public PhotoPage goToPhotoPage()
    {
        driver.findElement(PHOTO_PAGE_TAB).click();
        return new PhotoPage();
    }

    public TiresPage goToTiresPage() {
        driver.findElement(TIRES_PAGE_TAB).click();
        return new TiresPage();
    }

    public RefrigeratorPage goToRefrigeratorPage() {
        driver.findElement(REFRIGERATOR_PAGE_TAB).click();
        return new RefrigeratorPage();
    }

    public HeaterPage goToHeaterPage() {
        driver.findElement(HEATER_PAGE_TAB).click();
        return new HeaterPage();
    }

    public DisplayPage goToDisplayPage() {
        driver.findElement(DISPLAY_PAGE_TAB).click();
        return new DisplayPage();
    }

    public HeadphonesPage goToHeadphonesPage() {
        driver.findElement(HEADPHONES_PAGE_TAB).click();
        return new HeadphonesPage();
    }

    public DesktopPcPage goToDesktopPcPage() {
        driver.findElement(DESKTOP_PC_PAGE_TAB).click();
        return new DesktopPcPage();
    }

    public ActionCameraPage goToActionCameraPage() {
        driver.findElement(ACTION_CAMERA_PAGE_TAB).click();
        return new ActionCameraPage();
    }

/*    public static void GoToPrinterPage(WebDriver driver) {
        driver.findElement(PRINTERS_PAGE_TAB).click();
    }

    public static void GoToParfumePage(WebDriver driver) {
        driver.findElement(PARFUME_PAGE_TAB).click();
    }

    public static void GoToHousePage(WebDriver driver) {
        driver.findElement(HOUSE_PAGE_TAB).click();
    }*/

}
