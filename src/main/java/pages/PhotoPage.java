package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class PhotoPage {
    private WebDriver driver;
    private static By PHOTO_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public PhotoPage() {
        super();
    }

    public static boolean PhotoPageIsOpened (WebDriver driver) {
        return driver.findElement(PHOTO_PAGE_TITLE).getText().contains("Фотоаппараты");
    }
}
