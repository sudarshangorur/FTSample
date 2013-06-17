import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class GuardianSiteTests {



    @Test
    public void testFootballLink() {
        WebDriver webDriver = new FirefoxDriver();

        try{
            webDriver.get("http://www.guardian.co.uk/");
            GoToFootballPage(webDriver, By.partialLinkText("Football"));
            System.out.print("clicked");
        }
        finally {

            webDriver.close();
        }
    }

    private void GoToFootballPage(WebDriver webDriver, By byCriteria) {
        webDriver.findElement(By.partialLinkText("Sport")).click();
        WaitFor(webDriver, byCriteria);
        webDriver.findElement(byCriteria).click();
    }

    private void WaitFor(WebDriver webDriver, By byCriteria) {
        WebDriverWait w = new WebDriverWait(webDriver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(byCriteria));

    }
}
