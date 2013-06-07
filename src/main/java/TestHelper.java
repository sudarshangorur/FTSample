import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestHelper {

    @AfterTest(alwaysRun = true)
    public void closeBrowser(){
        Browser.closeBrowser();
    }

    @BeforeTest(alwaysRun = true)
    public void openStore(){
        Browser.openBrowser();
    }
}
