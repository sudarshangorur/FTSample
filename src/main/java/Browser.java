import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {

    public static FirefoxDriver webDriver;


    public static void openBrowser(){
        webDriver = new FirefoxDriver();
        webDriver.get("http://iap-py.appspot.com/");
    }


    public static void closeBrowser(){
        webDriver.quit();
    }
}
