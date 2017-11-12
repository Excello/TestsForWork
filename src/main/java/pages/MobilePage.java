package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class MobilePage {
    private static By MOBILE_PAGE_ITEMS = By.id("schema-products");
    private static By MOBILE_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By MOBILE_PAGE_FILTERS = By.id("schema-filter");
    private static By MOBILE_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");


    public static boolean MobilePageIsOpened (WebDriver driver) {
        return driver.findElement(MOBILE_PAGE_TITLE).getText().contains("Мобильные телефоны");
    }

    public static void CheckMobileProducts (WebDriver driver) {
//        Assert.assertEquals("Мобильные телефоны присутсвуют", driver.findElement(MOBILE_PAGE_ITEMS).isDisplayed(), true);
        driver.findElement(MOBILE_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(MOBILE_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(MOBILE_PAGE_ANY_FILTER).isDisplayed();
    }

}
