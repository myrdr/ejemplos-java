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
  private MisAcciones acciones;
  /** Contactos **/
  private MisContactos contactos;

  public VentanaPrincipal(String titulo) {
    super(titulo);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    contactos = new MisContactos();
    acciones  = new MisAcciones();
    miMenu    = new MiMenu(acciones);

    pnlCont = new PanelContactos(contactos);
    slpCont = new JScrollPane(pnlCont);


    acciones.setVentanaPrincipal(this);
    acciones.setPanelContactos(pnlCont);

    this.setJMenuBar(miMenu.createMenuBar());

    // txtIP = new JTextField();
    //add(txtIP);
    add(slpCont, BorderLayout.WEST);


    setSize(500,500);

    // Poner un icono al programa
    setIconImage( createImageIcon("img/messengericon.png").getImage() );


    // Poner al centro de la pantalla
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2,
		     dim.height/2-this.getSize().height/2);
  }

  public void showAddUser() {
    /** Ventana para agregar un nuevo usuario **/
    AddUserWindow auw;
    auw = new AddUserWindow(this);
  }

  public PanelContactos getPanelContactos() {
    return pnlCont;
  }

  /** Returns an ImageIcon, or null if the path was invalid. */
  protected static ImageIcon createImageIcon(String path) {
    java.net.URL imgURL = AddUserWindow.class.getResource(path);
    if (imgURL != null) {
      return new ImageIcon(imgURL);
    } else {
      System.err.println("Couldn't find file: " + path);
      return null;
    }
  }

}

