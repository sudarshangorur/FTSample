import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class StartPurchase extends TestHelper {

    @Test
    public static void testShouldDisplayPurchaseDetailsOnClickingPurchase() {
        String actualPosterPrice =  new DoodlePosterStore().beginPurchase().posterPrice();
        assertEquals(actualPosterPrice, "$20.00 USD");
    }

}
