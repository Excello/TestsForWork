import core.TestData;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogVerifying extends TestData {

    @Test
    public void MobileCatalogTest() {
        MobilePage mobilePage = new MobilePage(driver);
        mobilePage.checkCatalogPageIsOpened();
    }
    @Test(priority=1)
    public void TabletPcCatalogTest() {
        TabletPcPage tabletPcPage = new TabletPcPage(driver);
        tabletPcPage.checkCatalogPageIsOpened();
    }
    @Test(priority=2)
    public void NotebookCatalogTest() {
        NotebookPage notebookPage = new NotebookPage(driver);
        notebookPage.checkCatalogPageIsOpened();
    }
    @Test(priority=3)
    public void TvCatalogTest() {
        TvPage tvPage = new TvPage(driver);
        tvPage.checkCatalogPageIsOpened();
    }
    @Test(priority=4)
    public void PhotoCatalogTest() {
        PhotoPage photoPage = new PhotoPage(driver);
        photoPage.checkCatalogPageIsOpened();
    }
    @Test(priority=5)
    public void TiresCatalogTest() {
        TiresPage tiresPage = new TiresPage(driver);
        tiresPage.checkCatalogPageIsOpened();
    }
    @Test(priority=6)
    public void RefrigeratorCatalogTest() {
        RefrigeratorPage refrigeratorPage = new RefrigeratorPage(driver);
        refrigeratorPage.checkCatalogPageIsOpened();
    }
    @Test(priority=7)
    public void HeaterCatalogTest() {
        HeaterPage heaterPage = new HeaterPage(driver);
        heaterPage.checkCatalogPageIsOpened();
    }
    @Test(priority=8)
    public void DisplayCatalogTest() {
        DisplayPage displayPage = new DisplayPage(driver);
        displayPage.checkCatalogPageIsOpened();
    }
    @Test(priority=9)
    public void HeadphonesCatalogTest() {
        HeadphonesPage headphonesPage = new HeadphonesPage(driver);
        headphonesPage.checkCatalogPageIsOpened();
    }
    @Test(priority=10)
    public void DesktopPcCatalogTest() {
        DesktopPcPage desktopPcPage = new DesktopPcPage(driver);
        desktopPcPage.checkCatalogPageIsOpened();
    }
    @Test(priority=11)
    public void ActionCameraCatalogTest() {
        ActionCameraPage actionCameraPage = new ActionCameraPage(driver);
        actionCameraPage.checkCatalogPageIsOpened();
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
