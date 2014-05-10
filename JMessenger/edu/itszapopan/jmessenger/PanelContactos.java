package edu.itszapopan.jmessenger;

import javax.swing.*;  // JPanel
import java.awt.*;     // BoxLayout
import java.util.*;    // List, ArrayList

public class PanelContactos extends JPanel {

  java.util.List<JLabel> listOfLabels = new ArrayList<JLabel>();

  public PanelContactos() {

    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    for(int i=0; i<5; i++) {
      listOfLabels.add(new JLabel("Label "+ i));
    }
    for(int i=0; i<5; i++) {
      add(listOfLabels.get(i));
      listOfLabels.get(i).setIcon( new ImageIcon("img/brown_woman.png") );
    }
  
  }

}

