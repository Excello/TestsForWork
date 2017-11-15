package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class DesktopPcPage extends CommonCatalogPage {
    private WebDriver driver;
    private static By DESKTOP_PC_PAGE_ITEMS = By.id("schema-products");
    private static By DESKTOP_PC_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By DESKTOP_PC_PAGE_FILTERS = By.id("schema-filter");
    private static By DESKTOP_PC_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public DesktopPcPage(WebDriver driver) {
        this.driver = driver;
    }


    public static boolean DesktopPcPageIsOpened (WebDriver driver) {
        return driver.findElement(DESKTOP_PC_PAGE_TITLE).getText().contains("Компьютеры");
    }

    public static void CheckDesktopPcProducts (WebDriver driver) {
        driver.findElement(DESKTOP_PC_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(DESKTOP_PC_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(DESKTOP_PC_PAGE_ANY_FILTER).isDisplayed();
    }

}
