package edu.itszapopan.jmessenger;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

  //private JTextField txtIP;
  
  /** Panel izquierdo donde se pondrán los contactos */
  private PanelContactos pnlCont;
  /** Para poder poner barras de desplazamiento al panel de contactos */ 
  private JScrollPane    slpCont;
  /** Para poner un menu en la ventana */
  private MiMenu         miMenu;
  /** Acciones del programa **/
  private MisAcciones ma;

  public VentanaPrincipal(String titulo) {
    super(titulo);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    pnlCont = new PanelContactos();
    slpCont = new JScrollPane(pnlCont);

    ma = new MisAcciones();
    miMenu  = new MiMenu(ma);

    ma.setVentanaPrincipal(this);
    ma.setPanelContactos(pnlCont);

    this.setJMenuBar(miMenu.createMenuBar());

    // txtIP = new JTextField();
    //add(txtIP);
    add(slpCont, BorderLayout.WEST);


    setSize(500,500);
  }

  public void showAddUser() {
    /** Ventana para agregar un nuevo usuario **/
    AddUserWindow auw;
    auw = new AddUserWindow(this);
  }

}

