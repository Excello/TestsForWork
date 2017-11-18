package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class PhotoPage extends CommonCatalogPage {
    private static By PHOTO_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public PhotoPage() {
        super();
    }

    public PhotoPage isPhotoPageOpened () {
        Assert.assertTrue(driver.findElement(PHOTO_PAGE_TITLE).getText().contains("Фотоаппараты"));
        return new PhotoPage();
    }
}
