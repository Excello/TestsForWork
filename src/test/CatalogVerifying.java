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
        switch (pageName) {
            case "ActionCameraPage" : ActionCameraPage actionCameraPage = catalogNavigatorPage.goToActionCameraPage();
                actionCameraPage.isActionCameraPageOpened();
                actionCameraPage.isProductsDisplayed();
                actionCameraPage.isFilterSectionDisplayed();
                actionCameraPage.isAnyFilterExisted();
                break;
            case "DesktopPcPage" : DesktopPcPage desktopPcPage = catalogNavigatorPage.goToDesktopPcPage();
                desktopPcPage.isDesktopPcPageOpened();
                desktopPcPage.isProductsDisplayed();
                desktopPcPage.isFilterSectionDisplayed();
                desktopPcPage.isAnyFilterExisted();
                break;
            case "DisplayPage" : DisplayPage displayPage = catalogNavigatorPage.goToDisplayPage();
                displayPage.isDisplayPageOpened();
                displayPage.isProductsDisplayed();
                displayPage.isFilterSectionDisplayed();
                displayPage.isAnyFilterExisted();
                break;
            case "HeadphonesPage" : HeadphonesPage headphonesPage = catalogNavigatorPage.goToHeadphonesPage();
                headphonesPage.isHeadphonesPageOpened();
                headphonesPage.isProductsDisplayed();
                headphonesPage.isFilterSectionDisplayed();
                headphonesPage.isAnyFilterExisted();
                break;
            case "HeaterPage" : HeaterPage heaterPage = catalogNavigatorPage.goToHeaterPage();
                heaterPage.isHeaterPageOpened();
                heaterPage.isProductsDisplayed();
                heaterPage.isFilterSectionDisplayed();
                heaterPage.isAnyFilterExisted();
                break;
            case "MobilePage" : MobilePage mobilePage = catalogNavigatorPage.goToMobilePage();
                mobilePage.isMobilePageOpened();
                mobilePage.isProductsDisplayed();
                mobilePage.isFilterSectionDisplayed();
                mobilePage.isAnyFilterExisted();
                break;
            case "NotebookPage" : NotebookPage notebookPage = catalogNavigatorPage.goToNotebookPage();
                notebookPage.isNotebookPageOpened();
                notebookPage.isProductsDisplayed();
                notebookPage.isFilterSectionDisplayed();
                notebookPage.isAnyFilterExisted();
                break;
            case "PhotoPage" : PhotoPage photoPage = catalogNavigatorPage.goToPhotoPage();
                photoPage.isPhotoPageOpened();
                photoPage.isProductsDisplayed();
                photoPage.isFilterSectionDisplayed();
                photoPage.isAnyFilterExisted();
                break;
            case "RefrigeratorPage" : RefrigeratorPage refrigeratorPage = catalogNavigatorPage.goToRefrigeratorPage();
                refrigeratorPage.isRefrigeratorPageOpened();
                refrigeratorPage.isProductsDisplayed();
                refrigeratorPage.isFilterSectionDisplayed();
                refrigeratorPage.isAnyFilterExisted();
                break;
            case "TabletPcPage" : TabletPcPage tabletPcPage = catalogNavigatorPage.goToTabletPcPage();
                tabletPcPage.isTabletPcPageOpened();
                tabletPcPage.isProductsDisplayed();
                tabletPcPage.isFilterSectionDisplayed();
                tabletPcPage.isAnyFilterExisted();
                break;
            case "TiresPage" : TiresPage tiresPage = catalogNavigatorPage.goToTiresPage();
                tiresPage.isTiresPageOpened();
                tiresPage.isProductsDisplayed();
                tiresPage.isFilterSectionDisplayed();
                tiresPage.isAnyFilterExisted();
            case "TvPage" : TvPage tvPage = catalogNavigatorPage.goToTvPage();
                tvPage.isTvPageOpened();
                tvPage.isProductsDisplayed();
                tvPage.isFilterSectionDisplayed();
                tvPage.isAnyFilterExisted();
                break;
        }
    }

    @Test(priority = 1)
    public void ActionCameraPageTest() {
        checkCatalogs("ActionCameraPage");
    }

    @Test(priority = 2)
    public void DesktopPcPageTest() {
        checkCatalogs("DesktopPcPage");
    }

    @Test(priority = 3)
    public void DisplayPageTest() {
        checkCatalogs("DisplayPage");
    }

    @Test(priority = 4)
    public void HeadphonesPageTest() {
        checkCatalogs("HeadphonesPage");
    }

    @Test(priority = 5)
    public void HeaterPageTest() {
        checkCatalogs("HeaterPage");
    }

    @Test(priority = 6)
    public void MobilePageTest() {
        checkCatalogs("MobilePage");
    }

    @Test(priority = 7)
    public void NotebookPageTest() {
        checkCatalogs("NotebookPage");
    }

    @Test(priority = 8)
    public void PhotoPageTest() {
        checkCatalogs("PhotoPage");
    }

    @Test(priority = 9)
    public void RefrigeratorPageTest() {
        checkCatalogs("RefrigeratorPage");
    }

    @Test(priority = 10)
    public void TabletPcPageTest() {
        checkCatalogs("TabletPcPage");
    }

    @Test(priority = 11)
    public void TiresPageTest() {
        checkCatalogs("TiresPage");
    }

    @Test(priority = 12)
    public void TvPage() {
        checkCatalogs("TvPageTest");
    }
}
