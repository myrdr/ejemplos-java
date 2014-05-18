package edu.itszapopan.jmessenger;

import javax.swing.*;  // JPanel
import java.awt.*;     // BoxLayout
import java.util.*;    // List, ArrayList

public class PanelContactos extends JPanel {

  java.util.List<JLabel> listOfLabels = new ArrayList<JLabel>();

  public PanelContactos() {

    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    for(int i=0; i<5; i++) {
      addContact("Label "+i, "img/brown_woman.png");
    }

    /*
    for(int i=0; i<5; i++) {
      listOfLabels.add(new JLabel("Label "+ i));
    }
    for(int i=0; i<5; i++) {
      listOfLabels.get(i).setIcon( new ImageIcon("img/brown_woman.png") );
    }
    */
  
  }

  /** Agrega nuevo Contacto. */
  public void addContact(String nombre, String img) {
    ImageIcon icon;
    JLabel lblNombre; 

    icon = new ImageIcon(img);
    lblNombre = new JLabel(nombre, icon, JLabel.LEFT);

    listOfLabels.add( lblNombre );

    this.add( lblNombre );
  }

}

