package utility;

import java.util.Objects;

public class ProbabilityOfCoin{
    private double headProbability;
    private double tailProbability;
    private double side;

    public ProbabilityOfCoin(double headProbability,double tailProbability) {
        this.headProbability = headProbability;
        this.tailProbability = tailProbability;
    }

    public ProbabilityOfCoin(double side) {
        this.side=side;
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

    public double and(ProbabilityOfCoin event2) {
        return (this.side * event2.side);
    }
    public double not() {
        return 1-side;
    }

}
