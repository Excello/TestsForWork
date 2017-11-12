import core.TestData;
import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.MobilePage;
import pages.TabletPcPage;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogVerifying extends TestData {

    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void TabletPcCatalogTest() {
        CatalogPage.GoToTabletPcPage(driver);
        TabletPcPage.TabletPcPageIsOpened(driver);
        TabletPcPage.CheckTabletPcProducts(driver);
        TabletPcPage.CheckFilterSection(driver);
        TabletPcPage.AnyFilterIsExisted(driver);
    }
/*    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }*/
}
