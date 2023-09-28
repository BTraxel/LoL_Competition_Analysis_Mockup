public class BMRCompetitor{
    protected int Nb;
    protected int Lvl;
    protected Name name;
    protected String pseudo;
    protected Rank rank;
    protected double[] Scores;
    protected double OverallScore;

    public BMRCompetitor(){
    }

    public BMRCompetitor(int nb, int lvl, Name n, int rk, String ps, double[] scores){
        rank = Rank.values()[rk];
        pseudo = ps;
        Nb = nb;
        Lvl = lvl;
        name = n;
        Scores = scores;
   }

    public double[] getScoreArray(){
        return Scores;
    }

    public int getNb() {  return Nb;  }
    public int getLvl() {  return Lvl;  }
    public Rank getrank() {  return rank;  }

    public double getOverallScore(){
        OverallScore = PersonalMath.Average(Scores);
        return OverallScore;
    }

    public String getInfo(){
        String StrScores = getStringScores();
        String e = String.format("%-2.2s %-7.7s %-13.13s %-3.3s %-9.9s %-7.7s %-3.3s %n",Nb,pseudo,name.getFullName(),Lvl,StrScores,rank,OverallScore);
        return(e);
    }

    public String getStringScores(){
        String StrScores = ""+Scores[0];
        for (int i =1; i < Scores.length; i++){
            StrScores = StrScores+", "+Scores[i];
        }
        return StrScores;
    }

    public void SetScore(int scoretomodify, double newscore){
        getScoreArray()[scoretomodify] = newscore;
        getOverallScore();
    }

    public String getFullDetails(){
        String StrScores = getStringScores();
        return (String.format("Competitor number "+Nb+" "+pseudo+", real name "+name.getFullName()+"\n"+name.getFirstName() +" is a "+rank+" level "+Lvl+" and received these scores : "+StrScores+"\nThis gives them an overall score of %-4.4s", OverallScore));
    }

    public String getShortDetails(){
        return (String.format("CN "+Nb+" ("+name.getInit()+") has overall score %-4.4s", OverallScore));
    }
}



