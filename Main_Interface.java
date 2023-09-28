//import java classes for GUI components
import jdk.nashorn.internal.ir.WhileNode;

import java.awt.*; //for graphics, some components
import javax.swing.*; //for most components
import java.awt.event.*;//for event handling
import java.util.ArrayList;
import java.util.Arrays;


public class Main_Interface extends JFrame implements ActionListener {
    boolean flag1 = false;
    boolean flag2 = false;
    int size;
    int listing = 1;
    int mode = 1;
    int detaillevel = 1;
    int searchednb = -1;
    int scoretomodify = -1;
    double newscore = -1;
    ArrayList<Integer> existingnbARAM = new ArrayList<Integer>();
    ArrayList<Integer> existingnbRift = new ArrayList<Integer>();
    ArrayList<Integer> existingnbTwistedTreeLine = new ArrayList<Integer>();
    ArrayList<Integer> ScoresRift = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    ArrayList<Integer> ScoresTwisted = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
    ArrayList<Integer> ScoresARAM = new ArrayList<Integer>(Arrays.asList(1,2,3));
    String searchresult;
    String statistics;
    BMRCompetitorList cl = new BMRCompetitorList();
    //declarations of instance variables
    //Label
    JLabel S, M, L, Lod, Selected;
    //Buttons
    JButton search, stats, modifyscores;
    //Pannels
    JPanel northPanel = new JPanel();
    JPanel northPanelu = new JPanel();
    JPanel northPanell = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel southPaneluu = new JPanel();
    JPanel southPanelum = new JPanel();
    JPanel southPanelu = new JPanel();
    JPanel southPanell = new JPanel();
    //Textfields
    JTextField searchField = new JTextField(5);
    JTextField result;
    //Text aera
    JTextArea displayList = new JTextArea(15, 20);
    //Font
    Font f = new Font(Font.MONOSPACED, Font.PLAIN, 14);
    //ScrollPane
    JScrollPane scrollList;
    //Combobox
    String[] Maps = new String[] {"Rift","Aram","Twisted"};
    JComboBox<String> MapsList = new JComboBox<>(Maps);
    String[] ListOrdering = new String[] {"Show competitor by level", "Show competitor by number", "Show competitor by overall score"};
    JComboBox<String> ListOrderingList = new JComboBox(ListOrdering);
    String[] LevelOfDetails = new String[] {"Short details","Full details"};
    JComboBox<String> LevelOfDetailsList = new JComboBox(LevelOfDetails);


    public void actionPerformed (ActionEvent e) {
        String comboboxtext = "";
        if(e.getSource() == modifyscores){
        if(searchednb != -1) {
                String s = JOptionPane.showInputDialog(this, "Which score do you want to change:\n", "Score selection dialog", JOptionPane.PLAIN_MESSAGE);
                try {
                    if (s.length() > 0) {
                        try {
                            if (mode == 1) {
                                if (ScoresRift.contains(Integer.parseInt(s))) {
                                    scoretomodify = Integer.parseInt(s);
                                    flag1 = true;
                                } else {
                                    String errorreport = "Enter a valid score number for Rift competitor score numbers are 1, 2, 3, 4, 5";
                                    JOptionPane.showMessageDialog(null, errorreport);
                                }
                            } else if (mode == 2) {
                                if (ScoresTwisted.contains(Integer.parseInt(s))) {
                                    scoretomodify = Integer.parseInt(s);
                                    flag1 = true;
                                } else {
                                    String errorreport = "Enter a valid score number for Twisted Tree Line competitor score numbers are 1, 2, 3, 4";
                                    JOptionPane.showMessageDialog(null, errorreport);
                                }
                            } else if (mode == 3) {
                                if (ScoresARAM.contains(Integer.parseInt(s))) {
                                    scoretomodify = Integer.parseInt(s);
                                    flag1 = true;
                                } else {
                                    String errorreport = "Enter a valid score number for ARAM competitor score numbers are 1, 2, 3";
                                    JOptionPane.showMessageDialog(null, errorreport);
                                }
                            }
                        } catch (NumberFormatException err) {
                            JOptionPane.showMessageDialog(null, "Enter an integer !!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No text entered");
                    }

                    if (flag1) {
                        String n = JOptionPane.showInputDialog(this, "Choose a new value:\n", "Score modification dialog", JOptionPane.PLAIN_MESSAGE);
                        if (n.length() > 0) {
                            try {
                                if (Double.parseDouble(n) >= 0.0 && Double.parseDouble(n) <= 5.0) {
                                    newscore = Double.parseDouble(n);
                                    flag2 = true;
                                } else {
                                    String errorreport = "Enter a valid score between 0 and 5";
                                    JOptionPane.showMessageDialog(null, errorreport);
                                }
                            } catch (NumberFormatException err) {
                                JOptionPane.showMessageDialog(null, "Enter a double !!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No text entered");
                        }
                    }
                }
                catch(NullPointerException err){

                }

                if(flag1 && flag2) {
                    JOptionPane.showMessageDialog(null, "Change made");
                    if (mode == 1) {
                        cl.getRiftAtNb(searchednb).SetScore(scoretomodify - 1, newscore);
                    } else if (mode == 2) {
                        cl.getTwistedTreeLineAtNb(searchednb).SetScore(scoretomodify - 1, newscore);
                    } else {
                        cl.getARAMAtNb(searchednb).SetScore(scoretomodify - 1, newscore);
                    }
                    flag1 = false;
                    flag2 = false;
                    cl.getAllCompetitorsbyOverallScore();
                    cl.getAllCompetitorsbyLvl();
                    displayList.setText(cl.getAllCompetitors(listing, mode));
                    if(mode == 1) {
                        if (detaillevel == 1) {
                            result.setText(cl.getRiftAtNb(searchednb).getShortDetails());
                        } else {
                            result.setText(cl.getRiftAtNb(searchednb).getFullDetails());
                        }
                    }else if(mode == 2){
                        if (detaillevel == 1) {
                            result.setText(cl.getTwistedTreeLineAtNb(searchednb).getShortDetails());
                        } else {
                            result.setText(cl.getTwistedTreeLineAtNb(searchednb).getFullDetails());
                        }
                    }else if(mode == 3){
                        if (detaillevel == 1) {
                            result.setText(cl.getARAMAtNb(searchednb).getShortDetails());
                        } else {
                            result.setText(cl.getARAMAtNb(searchednb).getFullDetails());
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "You didn't finish the modification process, no change made");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Do a search first!");
            }
        }else if (e.getSource() == search) {
            String searchString = searchField.getText().trim();
            try {
                if (searchString.length() > 0) {
                    if (mode == 1) {
                        existingnbRift = cl.getallnbRift();
                        if (existingnbRift.contains(Integer.parseInt(searchString))) {
                            if(detaillevel == 1) {
                                searchresult = cl.getRiftAtNb(Integer.parseInt(searchString)).getShortDetails();
                            }
                            else{
                                searchresult = cl.getRiftAtNb(Integer.parseInt(searchString)).getFullDetails();
                            }
                            result.setText(searchresult);
                            searchednb = Integer.parseInt(searchString);
                            Selected.setText("Selected number: "+searchString);
                        } else {
                            String errorreport = "";
                            errorreport += "Enter a valid number for id, valid id number for Rift are: ";
                            for (int nb : existingnbRift) {
                                errorreport += Integer.toString(nb) + " ";
                            }
                            JOptionPane.showMessageDialog(null, errorreport);
                        }
                    } else if (mode == 2) {
                        existingnbTwistedTreeLine = cl.getallnbTwistedTreeLine();
                        if (existingnbTwistedTreeLine.contains(Integer.parseInt(searchString))) {
                            if(detaillevel == 1) {
                                searchresult = cl.getTwistedTreeLineAtNb(Integer.parseInt(searchString)).getShortDetails();
                            }
                            else{
                                searchresult = cl.getTwistedTreeLineAtNb(Integer.parseInt(searchString)).getFullDetails();
                            }
                            result.setText(searchresult);
                            searchednb = Integer.parseInt(searchString);
                            Selected.setText("Selected number: "+searchString);
                        } else {
                            String errorreport = "";
                            errorreport += "Enter a valid number for id, valid id number for Aram are: ";
                            for (int nb : existingnbTwistedTreeLine) {
                                errorreport += Integer.toString(nb) + " ";
                            }
                            JOptionPane.showMessageDialog(null, errorreport);
                        }
                    } else {
                        existingnbARAM = cl.getallnbARAM();
                        if (existingnbARAM.contains(Integer.parseInt(searchString))) {
                            if(detaillevel == 1) {
                                searchresult = cl.getARAMAtNb(Integer.parseInt(searchString)).getShortDetails();
                            }
                            else{
                                searchresult = cl.getARAMAtNb(Integer.parseInt(searchString)).getFullDetails();
                            }
                            result.setText(searchresult);
                            searchednb = Integer.parseInt(searchString);
                            Selected.setText("Selected number: "+searchString);
                        } else {
                            String errorreport = "";
                            errorreport += "Enter a valid number for id, valid id number for Aram are: ";
                            for (int nb : existingnbARAM) {
                                errorreport += Integer.toString(nb) + " ";
                            }
                            JOptionPane.showMessageDialog(null, errorreport);
                        }
                    }
                    if(searchresult.length()*6.0  > this.getSize().width) {
                        this.setPreferredSize(new Dimension((int)(searchresult.length()*6.0), this.getHeight()));
                        this.pack();
                    }
                    else{
                        this.setPreferredSize(new Dimension(500, 500));
                        this.pack();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No text entered");
                }
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, "Enter a number !!");
            }
        } else if (e.getSource() == stats) {
            statistics = cl.getStat(mode);
            JOptionPane.showMessageDialog(null, statistics);
        } else {
            JComboBox<String> combo = (JComboBox<String>) e.getSource();
            comboboxtext = (String) combo.getSelectedItem();
        }
        if (comboboxtext.equals("Rift")) {
            mode = 1;
            size = cl.getSize(mode);
            M.setText("Rift");
            displayList.setText(cl.getAllCompetitors(listing, mode));
        }else if(comboboxtext.equals("Twisted")){
            mode = 2;
            size = cl.getSize(mode);
            M.setText("Twisted");
            displayList.setText(cl.getAllCompetitors(listing, mode));
        }else if(comboboxtext.equals("Aram")){
            mode = 3;
            size = cl.getSize(mode);
            M.setText("Aram");
            displayList.setText(cl.getAllCompetitors(listing,mode));
        }else if(comboboxtext.equals("Show competitor by number")){
            L.setText("Listed by number");
            listing = 2;
            displayList.setText(cl.getAllCompetitors(listing, mode));
        }else if(comboboxtext.equals("Show competitor by level")){
            L.setText("Listed by level");
            listing = 1;
            displayList.setText(cl.getAllCompetitors(listing, mode));
        }else if(comboboxtext.equals("Show competitor by overall score")){
            L.setText("Listed by overall score");
            listing = 3;
            displayList.setText(cl.getAllCompetitors(listing, mode));
        }else if(comboboxtext.equals("Short details")){
            Lod.setText("Short details");
            detaillevel = 1;
            if(searchednb != -1) {
                searchresult = cl.getRiftAtNb(searchednb).getShortDetails();
                result.setText(searchresult);
                if(searchresult.length()*6.0 > this.getSize().width) {
                    this.setPreferredSize(new Dimension((int)(searchresult.length()*6.0), this.getHeight()));
                    this.pack();
                }
                else{
                    this.setPreferredSize(new Dimension(500, 500));
                    this.pack();
                }
            }
        }else if(comboboxtext.equals("Full details")){
            Lod.setText("Full details");
            detaillevel = 2;
            if(searchednb != -1){
                searchresult = cl.getRiftAtNb(searchednb).getFullDetails();
                result.setText(searchresult);
                if(searchresult.length()*6.0 > this.getSize().width) {
                    this.setPreferredSize(new Dimension((int)(searchresult.length()*6.0), this.getHeight()));
                    this.pack();
                }
                else{
                    this.setPreferredSize(new Dimension(500, 500));
                    this.pack();
                }
            }
        }
    }


    private JLabel createOneLabel (String s, Color c){
        Font f = new Font(Font.SANS_SERIF, Font.BOLD, 18);
        JLabel label = new JLabel(s, JLabel.CENTER);
        label.setFont(f);
        label.setBackground(c);
        label.setOpaque(true);
        return label;
    }

    //constructor used to layout components
    //and initialise other instance variables
    public Main_Interface()
    {
        cl.readFile("BMRCompetitorList.CSV");

        this.setPreferredSize(new Dimension(500, 500));
        this.setLocation(100, 100);
        this.setTitle("Competitor report");
        this.setVisible(true);
        this.setLayout(new BorderLayout(1, 5));

        S = this.createOneLabel("Search", Color.LIGHT_GRAY);
        M = this.createOneLabel("Rift", Color.GREEN);
        L = this.createOneLabel("Listed by level", Color.GREEN);
        Lod = this.createOneLabel("Short details", Color.GREEN);
        Selected = this.createOneLabel("Selected number:", Color.GREEN);



        search = new JButton("Search");
        stats = new JButton("Statistics");
        modifyscores = new JButton("modifyscores");

        result = new JTextField();
        result.setText("Search a competitor to display his details");
        result.setEditable(false);

        displayList = new JTextArea(15, 20);
        displayList.setEditable(false);
        scrollList = new JScrollPane(displayList);

        northPanelu.add(MapsList);
        northPanelu.add(M);

        northPanell.add(ListOrderingList);
        northPanell.add(L);
        northPanell.add(stats);

        southPaneluu.add(S);
        southPaneluu.add(searchField);
        southPaneluu.add(search);
        southPaneluu.add(modifyscores);
        southPanelum.add(LevelOfDetailsList);
        southPanelum.add(Lod);
        southPanelum.add(Selected);

        southPanell.add(result);

        northPanel.setLayout(new GridLayout(2, 1));
        southPanel.setLayout(new GridLayout(2, 1));
        southPanelu.setLayout(new GridLayout(2, 1));


        southPanelu.add(southPaneluu);
        southPanelu.add(southPanelum);


        northPanel.add(northPanelu);
        northPanel.add(northPanell);

        southPanel.add(southPanelu);
        southPanel.add(southPanell);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(scrollList, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);


        displayList.setText(cl.getAllCompetitors(listing,mode));

        search.addActionListener(this);
        stats.addActionListener(this);
        modifyscores.addActionListener(this);

        MapsList.addActionListener(this);
        ListOrderingList.addActionListener(this);
        LevelOfDetailsList.addActionListener(this);
    }
}
