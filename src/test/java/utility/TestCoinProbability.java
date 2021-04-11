package utility;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCoinProbability {
    @Test
    void TestToCheckIfProbabilityOfHeadIsEqualToThatOfTail(){
        boolean expected=true;
        ProbabilityOfCoin coinProbability=new ProbabilityOfCoin(0.5,0.5);

        boolean actual=coinProbability.equals(coinProbability);

        assertEquals(expected,actual);

    }
    @Test
    void TestProbabilityOfTwoEventsOccurringTogether(){

        double expectedValue = 0.25;
        ProbabilityOfCoin tailOnFirstCoinToss = new ProbabilityOfCoin(0.5);
        ProbabilityOfCoin headsOnSecondCoinToss = new ProbabilityOfCoin(0.5);

        double actualValue = tailOnFirstCoinToss.and(headsOnSecondCoinToss);

        assertEquals(expectedValue, actualValue);

    }
    @Test
    void  TestProbabilityOfEventNotOccurring(){
        double expectedValue=0.5;
        ProbabilityOfCoin tailOnCoinToss = new ProbabilityOfCoin(0.5);

        double actualValue = tailOnCoinToss.not();

        assertEquals(expectedValue, actualValue);
    }
    @Test
    void TestProbabilityOfEitherEventsOccurring(){
        double expectedValue=0.75;
        ProbabilityOfCoin firstCoinToss = new ProbabilityOfCoin(0.5);
        ProbabilityOfCoin secondCoinToss = new ProbabilityOfCoin(0.5);

        double actualValue = firstCoinToss.or(secondCoinToss);

        assertEquals(expectedValue, actualValue);
    }




}
