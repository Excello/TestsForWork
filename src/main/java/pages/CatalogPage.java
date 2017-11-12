package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogPage {
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
    private static By PRINTERS_PAGE_TAB = By.linkText("Принтеры и МФУ");
    private static By PARFUME_PAGE_TAB = By.linkText("Парфюмерия");
    private static By HOUSE_PAGE_TAB = By.linkText("Дома, коттеджи");

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToTabletPcPage(WebDriver driver) {
        driver.findElement(TABLET_PC_PAGE_TAB).click();
    }

 /*   public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }*/

}
