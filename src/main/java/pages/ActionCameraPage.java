package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


/**
 * Created by Englich on 11.11.2017.
 *
 */
public class ActionCameraPage extends CommonCatalogPage{
    private WebDriver driver;
    private static By ACTION_CAMERA_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public ActionCameraPage() {
        super();
    }

    public boolean isActionCameraPageOpened () {
        return Assert.assertTrue(driver.findElement(ACTION_CAMERA_PAGE_TITLE).getText().contains(asd));
    }
}
