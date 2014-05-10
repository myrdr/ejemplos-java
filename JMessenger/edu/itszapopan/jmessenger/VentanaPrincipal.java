package edu.itszapopan.jmessenger;

import javax.swing.*;
import java.awt.*;


public class VentanaPrincipal extends JFrame {

  //private JTextField txtIP;
  private PanelContactos pnlCont;
  private JScrollPane slpCont;

  public VentanaPrincipal(String titulo) {
    super(titulo);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    pnlCont = new PanelContactos();
    slpCont = new JScrollPane(pnlCont);
    // txtIP = new JTextField();
    //add(txtIP);
    add(slpCont, BorderLayout.WEST);

    setSize(500,500);
  }

}

