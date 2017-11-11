import core.TestData;
import org.testng.annotations.Test;
import pages.CatalogPage;

/**
 * Created by Englich on 11.11.2017.
 */
public class CatalogVerifying extends TestData {

    @Test
    public void MobileCatalogTest() {
        CatalogPage.GoToMobilePage(driver);
        //TODO
    }
}
