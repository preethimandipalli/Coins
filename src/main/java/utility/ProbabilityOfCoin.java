package utility;

public class ProbabilityOfCoin{
    double headProbability;
    double tailProbability;

    public ProbabilityOfCoin(double headProbability,double tailProbability) {
        this.headProbability=headProbability;
        this.tailProbability=tailProbability;
    }

    @Override
    public boolean equals(Object o) {
        ProbabilityOfCoin coinProbability= (ProbabilityOfCoin) o;
        if(coinProbability.headProbability == tailProbability){
            return true;
        }
        return false;
    }

}
