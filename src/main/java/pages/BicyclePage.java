package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


/**
 * Created by Englich on 11.11.2017.
 *
 */
public class BicyclePage extends CommonCatalogPage{
    //TODO Этот локатор во всех страницах одинаковый. Зачем его дублировать
    private static By BICYCLE_PAGE_TITLE = By.cssSelector(".schema-header__title");

    BicyclePage(WebDriver driver) {
        super(driver);
    }

    public BicyclePage isActionCameraPageOpened() {
        //TODO Тело метода по сути везде одно и то же. Меняется только текст. Потому его надо переделать и сделать общим
        Assert.assertTrue(driver.findElement(BICYCLE_PAGE_TITLE).getText().contains("Велосипеды"));
        return new BicyclePage(driver);
    }
}
