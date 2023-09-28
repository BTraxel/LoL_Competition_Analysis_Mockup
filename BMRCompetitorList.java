import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BMRCompetitorList {
    private ArrayList<BMRCompetitorARAM> bMRCompetitorARAMList;
    private ArrayList<BMRCompetitorARAM> bMRCompetitorARAMListCopy;
    private ArrayList<BMRCompetitorARAM> bmRCompetitorARAMList;
    private ArrayList<BMRCompetitorARAM> bmrCompetitorARAMList;

    private ArrayList<BMRCompetitorRift> bMRCompetitorRiftList;
    private ArrayList<BMRCompetitorRift> bMRCompetitorRiftListCopy;
    private ArrayList<BMRCompetitorRift> bmRCompetitorRiftList;
    private ArrayList<BMRCompetitorRift> bmrCompetitorRiftList;

    private ArrayList<BMRCompetitorTwistedTreeLine> bMRCompetitorTwistedTreeLineList;
    private ArrayList<BMRCompetitorTwistedTreeLine> bMRCompetitorTwistedTreeLineListCopy;
    private ArrayList<BMRCompetitorTwistedTreeLine> bmRCompetitorTwistedTreeLineList;
    private ArrayList<BMRCompetitorTwistedTreeLine> bmrCompetitorTwistedTreeLineList;


    public BMRCompetitorList() {
        bMRCompetitorARAMListCopy = new ArrayList<BMRCompetitorARAM> ();
        bMRCompetitorARAMList = new ArrayList<BMRCompetitorARAM> ();
        bmRCompetitorARAMList = new ArrayList<BMRCompetitorARAM> ();
        bmrCompetitorARAMList = new ArrayList<BMRCompetitorARAM> ();

        bMRCompetitorRiftListCopy = new ArrayList<BMRCompetitorRift> ();
        bMRCompetitorRiftList = new ArrayList<BMRCompetitorRift> ();
        bmRCompetitorRiftList = new ArrayList<BMRCompetitorRift> ();
        bmrCompetitorRiftList = new ArrayList<BMRCompetitorRift> ();

        bMRCompetitorTwistedTreeLineListCopy = new ArrayList<BMRCompetitorTwistedTreeLine> ();
        bMRCompetitorTwistedTreeLineList = new ArrayList<BMRCompetitorTwistedTreeLine> ();
        bmRCompetitorTwistedTreeLineList = new ArrayList<BMRCompetitorTwistedTreeLine> ();
        bmrCompetitorTwistedTreeLineList = new ArrayList<BMRCompetitorTwistedTreeLine> ();
    }


    public int getindexbyLvlRift(int Lvl, ArrayList<BMRCompetitorRift> List){
        int index = 0;
        for(int i=0;i<List.size();i++){
            if(List.get(i).getLvl()==Lvl)
            {
                index = i;
            }
        }
        return(index);
    }

    public int getindexbyLvlARAM(int Lvl, ArrayList<BMRCompetitorARAM> List){
        int index = 0;
        for(int i=0;i<List.size();i++){
            if(List.get(i).getLvl()==Lvl)
            {
                index = i;
            }
        }
        return(index);
    }

    public int getindexbyLvlTwistedTreeLine(int Lvl, ArrayList<BMRCompetitorTwistedTreeLine> List){
        int index = 0;
        for(int i=0;i<List.size();i++){
            if(List.get(i).getLvl()==Lvl)
            {
                index = i;
            }
        }
        return(index);
    }

    public int getindexbyOverallScoreRift(double OverallScore, ArrayList<BMRCompetitorRift> List){
        int index = 0;
        for(int i=0;i<List.size();i++){
            if(List.get(i).getOverallScore()==OverallScore)
            {
                index = i;
            }
        }
        return(index);
    }

    public int getindexbyOverallScoreARAM(double OverallScore, ArrayList<BMRCompetitorARAM> List){
        int index = 0;
        for(int i=0;i<List.size();i++){
            if(List.get(i).getOverallScore()==OverallScore)
            {
                index = i;
            }
        }
        return(index);
    }

    public int getindexbyOverallScoreTwistedTreeLine(double OverallScore, ArrayList<BMRCompetitorTwistedTreeLine> List){
        int index = 0;
        for(int i=0;i<List.size();i++){
            if(List.get(i).getOverallScore()==OverallScore)
            {
                index = i;
            }
        }
        return(index);
    }


    public String getAllCompetitors(int opt, int opt2)
    {
        String report = "";
        if(opt2 == 3) {
            if (opt == 1) {
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorARAM b : bmRCompetitorARAMList) {
                    report += b.getInfo();
                    report += "\n";
                }
            } else if (opt == 2){
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorARAM b : bMRCompetitorARAMList) {
                    report += b.getInfo();
                    report += "\n";
                }
            }
            else{
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorARAM b : bmrCompetitorARAMList) {
                    report += b.getInfo();
                    report += "\n";
                }
            }
        }
        else if (opt2 ==1){
            if (opt == 1) {
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorRift b : bmRCompetitorRiftList) {
                    report += b.getInfo();
                    report += "\n";
                }
            } else if (opt == 2){
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorRift b : bMRCompetitorRiftList) {
                    report += b.getInfo();
                    report += "\n";
                }
            }
            else{
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorRift b : bmrCompetitorRiftList) {
                    report += b.getInfo();
                    report += "\n";
                }
            }
        }
        else if (opt2 ==2){
            if (opt == 1) {
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorTwistedTreeLine b : bmRCompetitorTwistedTreeLineList) {
                    report += b.getInfo();
                    report += "\n";
                }
            } else if (opt == 2){
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
                    report += b.getInfo();
                    report += "\n";
                }
            }
            else{
                report += String.format("%-1.1s %-7.7s %-13.13s %-3.3s %-9.9s %-9.9s %-15.15s %n", "N", "Pseudo", "Name", "Lvl", "Scores", "Rank", "OverallScore");
                for (BMRCompetitorTwistedTreeLine b : bmrCompetitorTwistedTreeLineList) {
                    report += b.getInfo();
                    report += "\n";
                }
            }
        }
        return report;
    }


    public void getAllCompetitorsbyLvl()
    {
        int place;
        int index;
        int sizeA = bMRCompetitorARAMList.size();
        int sizeR = bMRCompetitorRiftList.size();
        int sizeT = bMRCompetitorTwistedTreeLineList.size();
        bMRCompetitorARAMListCopy = (ArrayList<BMRCompetitorARAM>)bMRCompetitorARAMList.clone();
        bMRCompetitorRiftListCopy = (ArrayList<BMRCompetitorRift>)bMRCompetitorRiftList.clone();
        bMRCompetitorTwistedTreeLineListCopy = (ArrayList<BMRCompetitorTwistedTreeLine>)bMRCompetitorTwistedTreeLineList.clone();

        bmRCompetitorARAMList.clear();
        bmRCompetitorRiftList.clear();
        bmRCompetitorTwistedTreeLineList.clear();


        for(int h = 0; h<sizeA; h++) {;
            place = 0;
            for (int i = 0; i < bMRCompetitorARAMList.size(); i++) {
                if(place < bMRCompetitorARAMList.get(i).getLvl()){
                    place = bMRCompetitorARAMList.get(i).getLvl();
                }
            }
            index = getindexbyLvlARAM(place,bMRCompetitorARAMList);
            bmRCompetitorARAMList.add(bMRCompetitorARAMList.get(index));
            bMRCompetitorARAMList.remove(index);
        }
        bMRCompetitorARAMList = bMRCompetitorARAMListCopy;

        for(int h = 0; h<sizeR; h++) {;
            place = 0;
            for (int i = 0; i < bMRCompetitorRiftList.size(); i++) {
                if(place < bMRCompetitorRiftList.get(i).getLvl()){
                    place = bMRCompetitorRiftList.get(i).getLvl();
                }
            }
            index = getindexbyLvlRift(place,bMRCompetitorRiftList);
            bmRCompetitorRiftList.add(bMRCompetitorRiftList.get(index));
            bMRCompetitorRiftList.remove(index);
        }
        bMRCompetitorRiftList = bMRCompetitorRiftListCopy;

        for(int h = 0; h<sizeT; h++) {;
            place = 0;
            for (int i = 0; i < bMRCompetitorTwistedTreeLineList.size(); i++) {
                if(place < bMRCompetitorTwistedTreeLineList.get(i).getLvl()){
                    place = bMRCompetitorTwistedTreeLineList.get(i).getLvl();
                }
            }
            index = getindexbyLvlTwistedTreeLine(place,bMRCompetitorTwistedTreeLineList);
            bmRCompetitorTwistedTreeLineList.add(bMRCompetitorTwistedTreeLineList.get(index));
            bMRCompetitorTwistedTreeLineList.remove(index);
        }
        bMRCompetitorTwistedTreeLineList = bMRCompetitorTwistedTreeLineListCopy;
    }

    public void getAllCompetitorsbyOverallScore()
    {
        double place;
        int index;
        int sizeA = bMRCompetitorARAMList.size();
        int sizeR = bMRCompetitorRiftList.size();
        int sizeT = bMRCompetitorTwistedTreeLineList.size();
        bMRCompetitorARAMListCopy = (ArrayList<BMRCompetitorARAM>)bMRCompetitorARAMList.clone();
        bMRCompetitorRiftListCopy = (ArrayList<BMRCompetitorRift>)bMRCompetitorRiftList.clone();
        bMRCompetitorTwistedTreeLineListCopy = (ArrayList<BMRCompetitorTwistedTreeLine>)bMRCompetitorTwistedTreeLineList.clone();

        bmrCompetitorARAMList.clear();
        bmrCompetitorRiftList.clear();
        bmrCompetitorTwistedTreeLineList.clear();

        for(int h = 0; h<sizeA; h++) {;
            place = 0;
            for (int i = 0; i < bMRCompetitorARAMList.size(); i++) {
                if(place < bMRCompetitorARAMList.get(i).getOverallScore()){
                    place = bMRCompetitorARAMList.get(i).getOverallScore();
                }
            }
            index = getindexbyOverallScoreARAM(place,bMRCompetitorARAMList);
            bmrCompetitorARAMList.add(bMRCompetitorARAMList.get(index));
            bMRCompetitorARAMList.remove(index);
        }
        bMRCompetitorARAMList = bMRCompetitorARAMListCopy;

        for(int h = 0; h<sizeR; h++) {;
            place = 0;
            for (int i = 0; i < bMRCompetitorRiftList.size(); i++) {
                if(place < bMRCompetitorRiftList.get(i).getOverallScore()){
                    place = bMRCompetitorRiftList.get(i).getOverallScore();
                }
            }
            index = getindexbyOverallScoreRift(place,bMRCompetitorRiftList);
            bmrCompetitorRiftList.add(bMRCompetitorRiftList.get(index));
            bMRCompetitorRiftList.remove(index);
        }
        bMRCompetitorRiftList = bMRCompetitorRiftListCopy;

        for(int h = 0; h<sizeT; h++) {;
            place = 0;
            for (int i = 0; i < bMRCompetitorTwistedTreeLineList.size(); i++) {
                if(place < bMRCompetitorTwistedTreeLineList.get(i).getOverallScore()){
                    place = bMRCompetitorTwistedTreeLineList.get(i).getOverallScore();
                }
            }
            index = getindexbyOverallScoreTwistedTreeLine(place,bMRCompetitorTwistedTreeLineList);
            bmrCompetitorTwistedTreeLineList.add(bMRCompetitorTwistedTreeLineList.get(index));
            bMRCompetitorTwistedTreeLineList.remove(index);
        }
        bMRCompetitorTwistedTreeLineList = bMRCompetitorTwistedTreeLineListCopy;
    }


    public int getSize(int opt) {
        if(opt == 1){
            return bMRCompetitorRiftList.size();
        } else if(opt == 2){
            return bMRCompetitorTwistedTreeLineList.size();
        } else {
            return bMRCompetitorARAMList.size();
        }
    }


    public BMRCompetitorARAM getARAMAtIndex(int index) {
        return bMRCompetitorARAMList.get(index);
    }

    public BMRCompetitorARAM getARAMAtNb(int nb) {
        BMRCompetitorARAM CatNb = new BMRCompetitorARAM();
        for (BMRCompetitorARAM b:bMRCompetitorARAMList) {
            if (b.getNb() == nb) {
                CatNb = b;
                break;
            }
        }
        return CatNb;
    }

    public BMRCompetitorRift getRiftAtIndex(int index) {
        return bMRCompetitorRiftList.get(index);
    }

    public BMRCompetitorRift getRiftAtNb(int nb) {
        BMRCompetitorRift CatNb = new BMRCompetitorRift();
        for (BMRCompetitorRift b:bMRCompetitorRiftList) {
            if (b.getNb() == nb) {
                CatNb = b;
                break;
            }
        }
        return CatNb;
    }

    public BMRCompetitorTwistedTreeLine getTwistedTreeLineAtIndex(int index) {
        return bMRCompetitorTwistedTreeLineList.get(index);
    }

    public BMRCompetitorTwistedTreeLine getTwistedTreeLineAtNb(int nb) {
        BMRCompetitorTwistedTreeLine CatNb = new BMRCompetitorTwistedTreeLine();
        for (BMRCompetitorTwistedTreeLine b:bMRCompetitorTwistedTreeLineList) {
            if (b.getNb() == nb) {
                CatNb = b;
                break;
            }
        }
        return CatNb;
    }


    public BMRCompetitorARAM findARAMByNb(int nb)
    {
        for (BMRCompetitorARAM s : bMRCompetitorARAMList)
        {
            if (s.getNb() == nb)
            {
                return s;
            }
        }
        return null;
    }

    public BMRCompetitorRift findRiftByNb(int nb)
    {
        for (BMRCompetitorRift s : bMRCompetitorRiftList)
        {
            if (s.getNb() == nb)
            {
                return s;
            }
        }
        return null;
    }

    public BMRCompetitorTwistedTreeLine findTwistedTreeLineByNb(int nb)
    {
        for (BMRCompetitorTwistedTreeLine s : bMRCompetitorTwistedTreeLineList)
        {
            if (s.getNb() == nb)
            {
                return s;
            }
        }
        return null;
    }


    public int getCountOfPeopleAtLvlARAM(int lvl) {
        int count = 0;
       for (BMRCompetitorARAM b:bMRCompetitorARAMList) {
            if (b.getLvl()==lvl) {
                count++;
            }
        }
        return count;
    }

    public int getCountOfPeopleAtLvlRift(int lvl) {
        int count = 0;
        for (BMRCompetitorRift b:bMRCompetitorRiftList) {
            if (b.getLvl()==lvl) {
                count++;
            }
        }
        return count;
    }

    public int getCountOfPeopleAtLvlTwistedTreeLine(int lvl) {
        int count = 0;
        for (BMRCompetitorTwistedTreeLine b:bMRCompetitorTwistedTreeLineList) {
            if (b.getLvl()==lvl) {
                count++;
            }
        }
        return count;
    }



    public String getLvlFrequencyReports(int opt) {
        //work out max lvl
        int maxLvl = getMaxLvl(opt);
        //work out how many people at each lvl
        int [] freqLvl = new int [maxLvl];
        if(opt == 1) {
            for (BMRCompetitorRift b : bMRCompetitorRiftList) {
                int y = b.getLvl();
                freqLvl[y - 1]++;
            }
        }
        else if (opt == 2){
            for (BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
                int y = b.getLvl();
                freqLvl[y - 1]++;
            }
        }
        else {
            for (BMRCompetitorARAM b : bMRCompetitorARAMList) {
                int y = b.getLvl();
                freqLvl[y - 1]++;
            }
        }

        //create a report
        String report = "NUMBER OF COMPETITORS IN EACH LVL\n";
        for (int i = 0; i < freqLvl.length; i++) {
            report += "Lvl " + (i+1) + " : " + freqLvl[i] + "\n";
        }
        return report;
    }

    public String getRankFrequencyReports(int opt){
        //work out max rank
        int maxRank = getMaxRank(opt);
        //work out how many people at each rank
        int [] freqRank = new int [maxRank];
        if(opt == 1) {
            for (BMRCompetitorRift b : bMRCompetitorRiftList) {
                int y = b.getrank().ordinal();
                freqRank[y - 1]++;
            }
        }
        else if (opt == 2){
            for (BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
                int y = b.getrank().ordinal();
                freqRank[y - 1]++;
            }
        }
        else{
            for (BMRCompetitorARAM b : bMRCompetitorARAMList) {
                int y = b.getrank().ordinal();
                freqRank[y - 1]++;
            }
        }
        //create a report
        String report = "NUMBER OF COMPETITORS IN EACH Rank\n";
        for (int i = 0; i < freqRank.length; i++) {
            report += "Rank " + Rank.values()[i+1] + " : " + freqRank[i] + "\n";
        }
        return report;
    }

    public int getMaxLvl(int opt) {
        int maxLvl = 0;
        if(opt == 1) {
            for (BMRCompetitorRift b : bMRCompetitorRiftList) {
                int lv = b.getLvl();
                if (lv > maxLvl) {
                    maxLvl = lv;
                }
            }
        }
        else if (opt == 2){
            for (BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
                int lv = b.getLvl();
                if (lv > maxLvl) {
                    maxLvl = lv;
                }
            }
        }
        else{
            for (BMRCompetitorARAM b : bMRCompetitorARAMList) {
                int lv = b.getLvl();
                if (lv > maxLvl) {
                    maxLvl = lv;
                }
            }
        }
        return maxLvl;
    }


    public BMRCompetitorARAM getBMRCompetitorARAMMaxLvl() {
        BMRCompetitorARAM MaxLvlBCompetitor = new BMRCompetitorARAM();
        int maxLvl = 0;
        for (BMRCompetitorARAM b : bMRCompetitorARAMList) {
            int lv = b.getLvl();
            if (lv> maxLvl) {
                maxLvl = lv;
                MaxLvlBCompetitor = b;
            }
        }
        return MaxLvlBCompetitor;
    }

    public BMRCompetitorRift getBMRCompetitorRiftMaxLvl() {
        BMRCompetitorRift MaxLvlBCompetitor = new BMRCompetitorRift();
        int maxLvl = 0;
        for (BMRCompetitorRift b : bMRCompetitorRiftList) {
            int lv = b.getLvl();
            if (lv> maxLvl) {
                maxLvl = lv;
                MaxLvlBCompetitor = b;
            }
        }
        return MaxLvlBCompetitor;
    }

    public BMRCompetitorTwistedTreeLine getBMRCompetitorTwistedTreeLineMaxLvl() {
        BMRCompetitorTwistedTreeLine MaxLvlBCompetitor = new BMRCompetitorTwistedTreeLine();
        int maxLvl = 0;
        for (BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
            int lv = b.getLvl();
            if (lv> maxLvl) {
                maxLvl = lv;
                MaxLvlBCompetitor = b;
            }
        }
        return MaxLvlBCompetitor;
    }

    public int getMaxRank(int opt){
        int maxRank = 0;
        if(opt == 1) {
            for (BMRCompetitorRift b : bMRCompetitorRiftList) {
                int lv = b.getrank().ordinal();
                if (lv > maxRank) {
                    maxRank = lv;
                }
            }
        }
        else if (opt == 2){
            for (BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
                int lv = b.getrank().ordinal();
                if (lv > maxRank) {
                    maxRank = lv;
                }
            }
        }
        else{
            for (BMRCompetitorARAM b : bMRCompetitorARAMList) {
                int lv = b.getrank().ordinal();
                if (lv > maxRank) {
                    maxRank = lv;
                }
            }
        }
        return maxRank;
    }

    public Object[] getBestandMinScore(int opt) {
        Object[] results = new Object[4];
        String MaxScore ="";
        String MinScore ="";
        double maxScore = 0;
        double minScore = 10;
        int size;
        if(opt == 1) {
            size = bMRCompetitorRiftList.size();
        }
        else if(opt == 2) {
            size = bMRCompetitorTwistedTreeLineList.size();
        }
        else{
            size = bMRCompetitorARAMList.size();
        }
        double[] Scores1 = new double[size];
        double[] Scores2 = new double[size];
        double[] Scores3 = new double[size];
        double[] Scores4 = new double[size];
        double[] Scores5 = new double[size];
        double Score1 = 0;
        double Score2 = 0;
        double Score3 = 0;
        double Score4 = 0;
        double Score5 = 0;

        int count = 0;
        if(opt == 1) {
            for (BMRCompetitorRift b : bMRCompetitorRiftList) {
                Scores1[count] = b.getScoreArray()[0];
                Scores2[count] = b.getScoreArray()[1];
                Scores3[count] = b.getScoreArray()[2];
                Scores4[count] = b.getScoreArray()[3];
                Scores5[count] = b.getScoreArray()[4];
                count += 1;
            }
        }
        else if (opt == 2){
            for (BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
                Scores1[count] = b.getScoreArray()[0];
                Scores2[count] = b.getScoreArray()[1];
                Scores3[count] = b.getScoreArray()[2];
                Scores4[count] = b.getScoreArray()[3];
                count += 1;
            }
        }
        else{
            for (BMRCompetitorARAM b : bMRCompetitorARAMList) {
                Scores1[count] = b.getScoreArray()[0];
                Scores2[count] = b.getScoreArray()[1];
                Scores3[count] = b.getScoreArray()[2];
                count += 1;
            }
        }

        for(int i=0; i<size; i++){
            Score1 += Scores1[i];
            Score2 += Scores2[i];
            Score3 += Scores3[i];
            Score4 += Scores4[i];
            Score5 += Scores5[i];
        }

        Score1 = Score1/size;
        Score2 = Score2/size;
        Score3 = Score3/size;
        Score4 = Score4/size;
        Score5 = Score5/size;

        if(opt == 1) {
            double[] Scores = {Score1, Score2, Score3, Score4, Score5};
            String[] NameList = {"1", "2", "3", "4", "5"};

            for (int s = 0; s < Scores.length; s++) {
                if (Scores[s] > maxScore) {
                    maxScore = Scores[s];
                    MaxScore = NameList[s];
                }
                if (Scores[s] < minScore) {
                    minScore = Scores[s];
                    MinScore = NameList[s];
                }
            }
        }
        else if(opt == 2){
            double[] Scores = {Score1, Score2, Score3, Score4};
            String[] NameList = {"1", "2", "3", "4"};

            for (int s = 0; s < Scores.length; s++) {
                if (Scores[s] > maxScore) {
                    maxScore = Scores[s];
                    MaxScore = NameList[s];
                }
                if (Scores[s] < minScore) {
                    minScore = Scores[s];
                    MinScore = NameList[s];
                }
            }
        }
        else{
            double[] Scores = {Score1, Score2, Score3};
            String[] NameList = {"1", "2", "3"};

            for (int s = 0; s < Scores.length; s++) {
                if (Scores[s] > maxScore) {
                    maxScore = Scores[s];
                    MaxScore = NameList[s];
                }
                if (Scores[s] < minScore) {
                    minScore = Scores[s];
                    MinScore = NameList[s];
                }
            }
        }
        results[0] = MaxScore;
        results[1] = maxScore;
        results[2] = MinScore;
        results[3] = minScore;
        return(results);
    }


    public String getSomeMoreStat(int opt){
        String report;
        Object[] results = new Object[4];
        double size;
        if(opt == 1) {
            size = bMRCompetitorRiftList.size();
        }
        else if (opt == 2){
            size = bMRCompetitorTwistedTreeLineList.size();
        }
        else{
            size = bMRCompetitorARAMList.size();
        }
        double avrank = 0;
        double avlvl = 0;
        double avOverallScore = 0;
        double correllvlrank;
        double correllvlOverallScore;
        double correlrankOverallScore;
        double[] rankl = new double[(int)size];
        double[] lvll = new double[(int)size];
        double [] OverallScorel = new double[(int)size];
        int i = 0;
        if(opt == 1) {
            for (BMRCompetitorRift b : bMRCompetitorRiftList) {
                rankl[i] = b.getrank().ordinal();
                OverallScorel[i] = b.getOverallScore();
                lvll[i] = b.getLvl();
                avlvl += b.getLvl();
                avOverallScore += b.getOverallScore();
                avrank += b.getrank().ordinal();
                i += 1;
            }
        }
        else if (opt == 2){
            for (BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
                rankl[i] = b.getrank().ordinal();
                OverallScorel[i] = b.getOverallScore();
                lvll[i] = b.getLvl();
                avlvl += b.getLvl();
                avOverallScore += b.getOverallScore();
                avrank += b.getrank().ordinal();
                i += 1;
            }
        }
        else{
            for (BMRCompetitorARAM b : bMRCompetitorARAMList) {
                rankl[i] = b.getrank().ordinal();
                OverallScorel[i] = b.getOverallScore();
                lvll[i] = b.getLvl();
                avlvl += b.getLvl();
                avOverallScore += b.getOverallScore();
                avrank += b.getrank().ordinal();
                i += 1;
            }
        }
        i = 0;
        avlvl = avlvl/size;
        avOverallScore = avOverallScore/size;
        avrank = Math.round(avrank/size);
        report = "There is "+getSize(opt)+" competitor \n";
        report += String.format("Average Lvl is %-4.4s, average OverallScore is %-4.4s, and average rank is "+Rank.values()[(int)avrank]+"\n", avlvl, avOverallScore);
        correllvlrank = PersonalMath.DoubleCorrelation(lvll, rankl);
        correllvlOverallScore = PersonalMath.DoubleCorrelation(lvll, OverallScorel);
        correlrankOverallScore = PersonalMath.DoubleCorrelation(OverallScorel, rankl);
        //Correlations
        report += String.format("The correlation between the level of the competitors and their rank is %-5.5s \n",correllvlrank);
        report += String.format("The correlation between the level of the competitors and their OverallScore is %-5.5s \n",correllvlOverallScore);
        report += String.format("The correlation between the rank of the competitors and their OverallScore is %-5.5s \n",correlrankOverallScore);
        //Best score min score inside Scores in average
        results = getBestandMinScore(opt);
        report += String.format("The competitors are the best in score "+results[0]+" with a score of %-4.4s and they are the worst in score "+results[2]+" with a score of %-4.4s \n",results[1],results[3]);
        return(report);
    }

    public String getStat(int opt){
        String report;
        //Frequency report, showing how many times each individual rank and lvl was awarded
        report = "";
        if(opt == 1){
            report += "Stats for Rift\n\n";
        }
        else if (opt == 2){
            report += "Stats for Twisted Tree Line\n\n";
        }
        else{
            report += "Stats for ARAM\n\n";
        }
        report += getLvlFrequencyReports(opt)+"\n";
        report += getRankFrequencyReports(opt)+"\n";
        //Statistics
        report += getSomeMoreStat(opt);
        return report;
    }

    public ArrayList<Integer> getallnbARAM(){
        ArrayList<Integer> nbARAMList = new ArrayList<Integer> ();
        for(BMRCompetitorARAM b : bMRCompetitorARAMList) {
            nbARAMList.add(b.getNb());
        }
        return(nbARAMList);
    }

    public ArrayList<Integer> getallnbRift(){
        ArrayList<Integer> nbRiftList = new ArrayList<Integer> ();
        for(BMRCompetitorRift b : bMRCompetitorRiftList) {
            nbRiftList.add(b.getNb());
        }
        return(nbRiftList);
    }

    public ArrayList<Integer> getallnbTwistedTreeLine(){
        ArrayList<Integer> nbRiftList = new ArrayList<Integer> ();
        for(BMRCompetitorTwistedTreeLine b : bMRCompetitorTwistedTreeLineList) {
            nbRiftList.add(b.getNb());
        }
        return(nbRiftList);
    }




    public  void writeToFile(String filename, String report) {

        FileWriter fw;
        try {
            fw = new FileWriter(filename);
            fw.write("---------------------------------\n");
            fw.write("------------The report-----------\n");
            fw.write("---------------------------------\n");
            fw.write(report);
            fw.close();
        }
        //message and stop if file not found
        catch (FileNotFoundException fnf){
            System.out.println(filename + " not found ");
            System.exit(0);
        }
        //stack trace here because we don't expect to come here
        catch (IOException ioe){
            ioe.printStackTrace();
            System.exit(1);
        }
    }

    public void readFile(String filename) {
        try {
            File f = new File(filename);
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                //read first line and process it
                String inputLine = scanner.nextLine();
                if (inputLine.length() != 0) {//ignored if blank line
                    processLine(inputLine);
                }

            }
        }
        //if the file is not found, stop with system exit
        catch (FileNotFoundException fnf){
            System.out.println( filename + " not found ");
            System.exit(0);
        }
        getAllCompetitorsbyLvl();
        getAllCompetitorsbyOverallScore();
    }

    private void processLine(String line) {
        try {
            String parts [] = line.split(",");


            int Nb = Integer.parseInt(parts[0]);
            int  Lvl = Integer.parseInt(parts[1]);
            Name name = new Name(parts[2]);
            int rk  = Integer.parseInt(parts[3]);
            String ps = parts[4];
            double[] Scores;

            BMRCompetitorRift s1;
            BMRCompetitorTwistedTreeLine s2;
            BMRCompetitorARAM s3;

            try {
                Scores = new double[5];
                for (int i = 0; i < 5; i++) {
                    Scores[i] += Double.parseDouble(parts[i + 5]);
                }
                try {
                    s1 = new BMRCompetitorRift(Nb, Lvl, name, rk, ps, Scores);
                } catch (ArrayIndexOutOfBoundsException air1) {
                    String error = "Competitor number " + Nb + " rank number " + rk + " does not correspond to any rank, rank set to iron";
                    System.out.println(error);
                    s1 = new BMRCompetitorRift(Nb, Lvl, name, 1, ps, Scores);
                }
                bMRCompetitorRiftList.add(s1);
            }
            catch(ArrayIndexOutOfBoundsException air){
                try {
                    Scores = new double[4];
                    for (int i = 0; i < 4; i++) {
                        Scores[i] += Double.parseDouble(parts[i + 5]);
                    }
                    try {
                        s2 = new BMRCompetitorTwistedTreeLine(Nb, Lvl, name, rk, ps, Scores);
                    } catch (ArrayIndexOutOfBoundsException air1) {
                        String error = "Competitor number " + Nb + " rank number " + rk + " does not correspond to any rank, rank set to iron";
                        System.out.println(error);
                        s2 = new BMRCompetitorTwistedTreeLine(Nb, Lvl, name, 1, ps, Scores);
                    }
                    bMRCompetitorTwistedTreeLineList.add(s2);
                }
                catch(ArrayIndexOutOfBoundsException air2){
                    Scores = new double[3];
                    for (int i = 0; i < 3; i++) {
                        Scores[i] += Double.parseDouble(parts[i + 5]);
                    }
                    try {
                        s3 = new BMRCompetitorARAM(Nb, Lvl, name, rk, ps, Scores);
                    } catch (ArrayIndexOutOfBoundsException air1) {
                        String error = "Competitor number " + Nb + " rank number " + rk + " does not correspond to any rank, rank set to iron";
                        System.out.println(error);
                        s3 = new BMRCompetitorARAM(Nb, Lvl, name, 1, ps, Scores);
                    }
                    bMRCompetitorARAMList.add(s3);
                }
            }

        }

        //this catches trying to convert a String to an integer
        catch (NumberFormatException nfe) {
            String error = "Number conversion error in '" + line + "'  - "
                    + nfe.getMessage();
            System.out.println(error);
        }
        //this catches missing items if only one or two items
        //other omissions will result in other errors
        catch (ArrayIndexOutOfBoundsException air) {
            String error = "Not enough items in  : '" + line + "' index position : " + air.getMessage();
            System.out.println(error);
        }
    }
}
