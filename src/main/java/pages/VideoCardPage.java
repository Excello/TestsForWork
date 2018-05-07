package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class VideoCardPage extends CommonCatalogPage {
    private static By VIDEO_CARD_PAGE_TITLE = By.cssSelector(".schema-header__title");

    VideoCardPage(WebDriver driver) {
        super(driver);
    }

    public VideoCardPage isDisplayPageOpened() {
        Assert.assertTrue(driver.findElement(VIDEO_CARD_PAGE_TITLE).getText().contains("Видеокарты"));
        return new VideoCardPage(driver);
    }
}
