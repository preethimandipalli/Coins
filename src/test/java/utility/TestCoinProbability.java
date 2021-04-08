package utility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCoinProbability {
    @Test
    void TestToCheckIfProbabilityOfHeadIsEqualToThatOfTail(){
        boolean expected=true;
        ProbabilityOfCoin coinProbability=new ProbabilityOfCoin();

        boolean actual=coinProbability.equals(coinProbability);

        assertEquals(expected,actual);

    }
    @Test
    void TestProbabilityOfTwoEventsOccurringTogether(){

        ProbabilityOfCoin coinOneProbability = new ProbabilityOfCoin();
        double coinOneHeadProbability=coinOneProbability.getHeadProbability();
        ProbabilityOfCoin coinTwoProbability = new ProbabilityOfCoin();
        double coinTwoTailProbability=coinTwoProbability.getTailProbability();
        double expectedProbability =0.25;

        double actualProbability = coinOneProbability.TwoEventsCombineProbability(coinOneHeadProbability,coinTwoTailProbability);

        assertEquals(expectedProbability,actualProbability);

    }



}
