public class BMRCompetitorTwistedTreeLine extends  BMRCompetitor{
    private double [] Weight = new double[]{1,2,2,3};

    public BMRCompetitorTwistedTreeLine(){}

    public BMRCompetitorTwistedTreeLine(int nb, int lvl, Name n, int rk, String ps, double[] scores) {
        super(nb, lvl, n, rk, ps, scores);
        OverallScore = getOverallScore();
    }

    public double getOverallScore(){
        OverallScore = PersonalMath.WeightedAverage(Scores,Weight);
        return OverallScore;
    }
}
