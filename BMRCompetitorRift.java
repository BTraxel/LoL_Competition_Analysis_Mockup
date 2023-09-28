public class BMRCompetitorRift extends  BMRCompetitor{
    private double[] Weight = new double[] {1,2,2,1,3};

    public BMRCompetitorRift(){}

    public BMRCompetitorRift(int nb, int lvl, Name n, int rk, String ps, double[] scores) {
        super(nb, lvl, n, rk, ps, scores);
        OverallScore = getOverallScore();
    }

    public double getOverallScore(){
        OverallScore = PersonalMath.WeightedAverage(Scores,Weight);
        return OverallScore;
    }
}
