import org.openqa.selenium.By;

public class DoodlePosterStore extends Browser {


    public GoogleWalletPopUp beginPurchase(){
        webDriver.findElement(By.cssSelector(".buy-button")).click();
        webDriver.switchTo().frame(0);
        return new GoogleWalletPopUp();
    }


}
