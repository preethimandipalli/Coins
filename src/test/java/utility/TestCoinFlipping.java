package utility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCoinFlipping {
    @Test
    void TestToCheckIfProbabilityOfHeadIsEqualToThatOfTail(){
        double headProbability=0.5;
        double tailProbability=0.5;
        boolean expected=true;
        ProbabilityOfCoin coinProbability=new ProbabilityOfCoin(headProbability,tailProbability);

        boolean actual=coinProbability.equals(coinProbability);

        assertEquals(expected,actual);

    }

}
