import core.TestData;
import org.testng.annotations.Test;
import pages.*;

import java.util.NoSuchElementException;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogVerifying extends TestData {
    @Test(priority=1)
    public void MobileCatalogTest() {
        MobilePage mobilePage = new CatalogNavigatorPage(driver).goToMobilePage();
        MobilePage mobilePageResult = new MobilePage(driver).isMobilePageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();

    }
    @Test(priority=1)
    public void TabletPcCatalogTest() {
        TabletPcPage tabletPcPage = new CatalogNavigatorPage(driver).goToTabletPcPage();
        TabletPcPage tabletPcPageResult = new TabletPcPage(driver).isTabletPcPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=2)
    public void NotebookCatalogTest() {
        NotebookPage notebookPage = new CatalogNavigatorPage(driver).goToNotebookPage();
        NotebookPage notebookPageResult = new NotebookPage(driver).isNotebookPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=3)
    public void TvCatalogTest() {
        TvPage tvPage = new CatalogNavigatorPage(driver).goToTvPage();
        TvPage tvPageResult = new TvPage(driver).isTvPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=4)
    public void PhotoCatalogTest() {
        PhotoPage photoPage = new CatalogNavigatorPage(driver).goToPhotoPage();
        PhotoPage photoPageResult = new PhotoPage(driver).isPhotoPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=5)
    public void TiresCatalogTest() {
        TiresPage tiresPage = new CatalogNavigatorPage(driver).goToTiresPage();
        TiresPage tiresPageResult = new TiresPage(driver).isTiresPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=6)
    public void RefrigeratorCatalogTest() {
        RefrigeratorPage refrigeratorPage = new CatalogNavigatorPage(driver).goToRefrigeratorPage();
        RefrigeratorPage refrigeratorPageResult = new RefrigeratorPage(driver).isRefrigeratorPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=7)
    public void HeaterCatalogTest() {
        HeaterPage heaterPage = new CatalogNavigatorPage(driver).goToHeaterPage();
        HeaterPage heaterPageResult = new HeaterPage(driver).isHeaterPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=8)
    public void DisplayCatalogTest() {
        DisplayPage displayPage = new CatalogNavigatorPage(driver).goToDisplayPage();
        DisplayPage displayPageResult = new DisplayPage(driver).isDisplayPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=9)
    public void HeadphonesCatalogTest() {
        HeadphonesPage headphonesPage = new CatalogNavigatorPage(driver).goToHeadphonesPage();
        HeadphonesPage headphonesPageResult = new HeadphonesPage(driver).isHeadphonesPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=10)
    public void DesktopPcCatalogTest() {
        DesktopPcPage desktopPcPage = new CatalogNavigatorPage(driver).goToDesktopPcPage();
        DesktopPcPage desktopPcPageResult = new DesktopPcPage(driver).isDesktopPcPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }
    @Test(priority=11)
    public void ActionCameraCatalogTest() {
        ActionCameraPage actionCameraPage = new CatalogNavigatorPage(driver).goToActionCameraPage();
        ActionCameraPage actionCameraPageResult = new ActionCameraPage(driver).isActionCameraPageOpened();
        CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage(driver).isProductsDisplayed();
        CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage(driver).isFilterSectionDisplayed();
        CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage(driver).isAnyFilterExisted();
    }

   /* Impossible to find on page these catalogs
    @Test
    public void PrintersCatalogTest() {
        CatalogNavigatorPage.GoToPrinterPage(driver);
        PrintersPage.PrintersPageIsOpened(driver);
        PrintersPage.CheckPrintersProducts(driver);
        PrintersPage.CheckFilterSection(driver);
        PrintersPage.AnyFilterIsExisted(driver);
    }
    @Test
    public void ParfumeCatalogTest() {
        CatalogNavigatorPage.GoToParfumePage(driver);
        ParfumePage.ParfumePageIsOpened(driver);
        ParfumePage.CheckParfumeProducts(driver);
        ParfumePage.CheckFilterSection(driver);
        ParfumePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void HouseCatalogTest() {
        CatalogNavigatorPage.GoToHousePage(driver);
        HousePage.HousePageIsOpened(driver);
        HousePage.CheckHouseProducts(driver);
        HousePage.CheckFilterSection(driver);
        HousePage.AnyFilterIsExisted(driver);
    }*/
}
