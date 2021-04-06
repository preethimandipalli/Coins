package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCoinFlipping {
    @Test
    void TestToCheckIfProbabilityOfHeadIsEqualToThatOfTail(){
        int count=1;
        Coins coin=new Coins(count);
        boolean expected=true;

        boolean actual=coin.checkEqualityOfProbability();

        assertEquals(expected,actual);

    }

}
