import org.openqa.selenium.By;


public class GoogleWalletPopUp extends Browser {


    public String posterPrice(){
        return webDriver.findElement(By.cssSelector("#itemPrice")).getText();
    }

}
