package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class PhotoPage {
    private WebDriver driver;
    private static By PHOTO_PAGE_ITEMS = By.id("schema-products");
    private static By PHOTO_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By PHOTO_PAGE_FILTERS = By.id("schema-filter");
    private static By PHOTO_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public PhotoPage(WebDriver driver) {
        this.driver = driver;
    }


    public static boolean PhotoPageIsOpened (WebDriver driver) {
        return driver.findElement(PHOTO_PAGE_TITLE).getText().contains("Фотоаппараты");
    }

    public static void CheckPhotoProducts (WebDriver driver) {
        driver.findElement(PHOTO_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(PHOTO_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(PHOTO_PAGE_ANY_FILTER).isDisplayed();
    }

}
