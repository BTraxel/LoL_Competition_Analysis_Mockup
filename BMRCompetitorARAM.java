public class BMRCompetitorARAM extends  BMRCompetitor{
    private double [] Weight = new double[]{1,2,2};

    public BMRCompetitorARAM(){}

    public BMRCompetitorARAM(int nb, int lvl, Name n, int rk, String ps, double[] scores) {
        super(nb, lvl, n, rk, ps, scores);
        OverallScore = getOverallScore();
    }

    public double getOverallScore(){
        OverallScore = PersonalMath.WeightedAverage(Scores,Weight);
        return OverallScore;
    }
}
