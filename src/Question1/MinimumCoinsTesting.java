package Question1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumCoinsTesting {
    @Test
    public void testMinimumCoins() {
        int[] ratings = {1, 0, 2};
        int expectedMinimumCoins = 5;

        int result = PathaoCoins.minimumCoins(ratings);
        assertEquals(expectedMinimumCoins, result);
    }
}