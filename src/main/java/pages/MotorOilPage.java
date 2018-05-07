package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class MotorOilPage extends CommonCatalogPage {
    private static By MOTOR_OIL_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public MotorOilPage(WebDriver driver) {
        super(driver);
    }

    public MotorOilPage isRefrigeratorPageOpened() {
        Assert.assertTrue(driver.findElement(MOTOR_OIL_PAGE_TITLE).getText().contains("Моторные масла"));
        return new MotorOilPage(driver);
    }
}
