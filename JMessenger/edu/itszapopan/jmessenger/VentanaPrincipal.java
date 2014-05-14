package edu.itszapopan.jmessenger;

import javax.swing.*;
import java.awt.*;


public class VentanaPrincipal extends JFrame {

  //private JTextField txtIP;
  
  /* Panel izquierdo donde se pondrán los contactos */
  private PanelContactos pnlCont;
  /* Para poder poner barras de desplazamiento al panel de contactos */ 
  private JScrollPane    slpCont;
  /* Para poner un menu en la ventana */
  private MiMenu         miMenu;

  public VentanaPrincipal(String titulo) {
    super(titulo);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    pnlCont = new PanelContactos();
    slpCont = new JScrollPane(pnlCont);
    miMenu  = new MiMenu();

    this.setJMenuBar(miMenu.createMenuBar());

    // txtIP = new JTextField();
    //add(txtIP);
    add(slpCont, BorderLayout.WEST);


    setSize(500,500);
  }

}

