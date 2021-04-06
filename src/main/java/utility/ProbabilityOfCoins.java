package utility;

public class ProbabilityOfCoins{
    double headProbability;
    double tailProbability;

    public ProbabilityOfCoins(double headProbability,double tailProbability) {
        this.headProbability=headProbability;
        this.tailProbability=tailProbability;
    }

    public boolean checkEqualityOfProbabilities() {
        if(headProbability == tailProbability){
            return true;
        }
        return false;

    }
}
