//Writen by Traxel Barthélémy H00412986 for part 2 of the F21SF Software Engineering Foundation coursework

public class Manager{
    public static void main(String[] args) {
        //GI
        Main_Interface gi = new Main_Interface();
        gi.setDefaultCloseOperation(gi.EXIT_ON_CLOSE);
        gi.pack();
        gi.setVisible(true);

        //Report
        BMRCompetitorList cl = new BMRCompetitorList();
        cl.readFile("BMRCompetitorList.CSV");
        String report = "\n-------------  Rift competitors ---------------\n";
        report += cl.getAllCompetitors(1, 1);
        report += "\nBest of them:\n";
        report += cl.getBMRCompetitorRiftMaxLvl().getFullDetails();
        report += "\n\n";
        report += "-----------  Twisted competitors --------------\n";
        report += cl.getAllCompetitors(1, 2);
        report += "\nBest of them:\n";
        report += cl.getBMRCompetitorTwistedTreeLineMaxLvl().getFullDetails();
        report += "\n\n";
        report += "-------------  ARAM competitors ---------------\n";
        report += cl.getAllCompetitors(1, 3);
        report += "\nBest of them:\n";
        report += cl.getBMRCompetitorARAMMaxLvl().getFullDetails();

        cl.writeToFile("Competitor_Report_2.txt", report);
    }
}
