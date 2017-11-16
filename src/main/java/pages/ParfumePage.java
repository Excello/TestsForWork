package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class ParfumePage {
    private static By PARFUME_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public ParfumePage() {
        super();
    }

    public static boolean ParfumePageIsOpened (WebDriver driver) {
        return driver.findElement(PARFUME_PAGE_TITLE).getText().contains("Парфюмерия");
    }

}
