package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


/**
 * Created by Englich on 11.11.2017.
 *
 */
public class BicyclePage extends BasePage {
    //TODO Этот локатор во всех страницах одинаковый. Зачем его дублировать [Moved to BasePage.class]

    static final String ID = "BicyclePage";

    BicyclePage(WebDriver driver) {
        super(driver);
    }
    //TODO Тело метода по сути везде одно и то же. Меняется только текст. Потому его надо переделать и сделать общим [isPageOpened method moved to BasePage.class]
}
