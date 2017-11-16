package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class HeadphonesPage {
    private WebDriver driver;
    private static By HEADPHONES_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public HeadphonesPage() {
        super();
    }

    public static boolean HeadphonesPageIsOpened (WebDriver driver) {
        return driver.findElement(HEADPHONES_PAGE_TITLE).getText().contains("Наушники и гарнитуры");
    }
}
