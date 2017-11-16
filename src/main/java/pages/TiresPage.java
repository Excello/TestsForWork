package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class TiresPage {
    private WebDriver driver;
    private static By TIRES_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public TiresPage() {
        super();
    }

    public static boolean TiresPageIsOpened (WebDriver driver) {
        return driver.findElement(TIRES_PAGE_TITLE).getText().contains("Автомобильные шины");
    }
}
