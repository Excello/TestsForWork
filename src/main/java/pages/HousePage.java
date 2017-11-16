package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class HousePage {
    private WebDriver driver;
    private static By HOUSE_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public HousePage() {
        super();
    }
    public static boolean HousePageIsOpened (WebDriver driver) {
        return driver.findElement(HOUSE_PAGE_TITLE).getText().contains("Дома, коттеджи");
    }
}
