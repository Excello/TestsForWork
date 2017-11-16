package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class MobilePage {
    private WebDriver driver;
    private static By MOBILE_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public MobilePage() {
        super();
    }

    public static boolean MobilePageIsOpened (WebDriver driver) {
        return driver.findElement(MOBILE_PAGE_TITLE).getText().contains("Мобильные телефоны");
    }
}
