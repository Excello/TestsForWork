import core.TestData;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogVerifying extends TestData {
    private void checkCatalogs(String pageName) {
        CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(driver);
        BasePage basePage = new BasePage(driver);
        //TODO
        //1. В switch оставить только переход на страницу. вызов isProductsDisplayed, isFilterSectionDisplayed, isAnyFilterExisted сделать за switch (Done)
        //2. Не нравится привязка к текстовому имени класса. Лучше напрямую делать например BicyclePage.class.getSimpleName() (Done)
        //3. В действительности лучше сдедать в catalogNavigatorPage метод openSubCatalog(Class catalogClass)
        switch (pageName) {
            case "BicyclePage" : catalogNavigatorPage.goToBicyclePage();
                basePage.isPageOpened("BicyclePage");
                break;
            case "VideoCardPage" : catalogNavigatorPage.goToVideoCardPage();
                basePage.isPageOpened("VideoCardPage");
                break;
            case "HeadphonesPage" : catalogNavigatorPage.goToHeadphonesPage();
                basePage.isPageOpened("HeadphonesPage");
                break;
            case "StrollersPage" : catalogNavigatorPage.goToStrollersPage();
                basePage.isPageOpened("StrollersPage");
                break;
            case "MobilePage" : catalogNavigatorPage.goToMobilePage();
                basePage.isPageOpened("MobilePage");
                break;
            case "NotebookPage" : catalogNavigatorPage.goToNotebookPage();
                basePage.isPageOpened("NotebookPage");
                break;
            case "PhotoPage" : catalogNavigatorPage.goToPhotoPage();
                basePage.isPageOpened("PhotoPage");
                break;
            case "MotorOilPage" : catalogNavigatorPage.goToMotorOilPage();
                basePage.isPageOpened("MotorOilPage");
                break;
            case "TabletPcPage" : catalogNavigatorPage.goToTabletPcPage();
                basePage.isPageOpened("TabletPcPage");
                break;
            case "TiresPage" : catalogNavigatorPage.goToTiresPage();
                basePage.isPageOpened("TiresPage");
                break;
            case "SmartWatchPage" : catalogNavigatorPage.goToSmartWatchPage();
                basePage.isPageOpened("SmartWatchPage");
                break;
        }
        basePage.isAnyFilterExisted();
        basePage.isFilterSectionDisplayed();
        basePage.isProductsDisplayed();
    }

    @Test(priority = 1)
    public void BicyclePageTest() {
        checkCatalogs("BicyclePage");
    }

    @Test(priority = 2)
    public void VideoCardPageTest() {
        checkCatalogs("VideoCardPage");
    }

    @Test(priority = 3)
    public void HeadphonesPageTest() {
        checkCatalogs("HeadphonesPage");
    }

    @Test(priority = 4)
    public void StrollersPageTest() {
        checkCatalogs("StrollersPage");
    }

    @Test(priority = 5)
    public void MobilePageTest() {
        checkCatalogs("MobilePage");
    }

    @Test(priority = 6)
    public void NotebookPageTest() {
        checkCatalogs("NotebookPage");
    }

    @Test(priority = 7)
    public void PhotoPageTest() {
        checkCatalogs("PhotoPage");
    }

    @Test(priority = 8)
    public void MotorOilPageTest() {
        checkCatalogs("MotorOilPage");
    }

    @Test(priority = 9)
    public void TabletPcPageTest() {
        checkCatalogs("TabletPcPage");
    }

    @Test(priority = 10)
    public void TiresPageTest() { checkCatalogs("TiresPage"); }

    @Test(priority = 11)
    public void SmartWatchPage() {
        checkCatalogs("SmartWatchPage");
    }
}
