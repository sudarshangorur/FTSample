import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;
import static org.testng.Assert.assertEquals;


public class StartPurchase extends TestHelper {

    @Test
    public void testShouldDisplayPurchaseDetailsOnClickingPurchase() {
        String actualPosterPrice =  new DoodlePosterStore().beginPurchase().posterPrice();
        assertThat(actualPosterPrice).isEqualTo("$20.00 USD");
    }

}
