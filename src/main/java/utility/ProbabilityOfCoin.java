package utility;

import java.util.Objects;

public class ProbabilityOfCoin{
    private double headProbability=0.5;
    private double tailProbability=0.5;

    public double getHeadProbability() {
        return headProbability;
    }
    public double getTailProbability() {
        return headProbability;
    }


    @Override
    public boolean equals(Object o) {
        ProbabilityOfCoin coinProbability= (ProbabilityOfCoin) o;

        if(coinProbability.headProbability == tailProbability){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(headProbability, tailProbability);
    }

    double TwoEventsCombineProbability(double event1probability,double event2Probability) {

        return event1probability * event2Probability;
    }




}
