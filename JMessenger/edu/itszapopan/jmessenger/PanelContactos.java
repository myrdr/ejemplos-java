package edu.itszapopan.jmessenger;

import javax.swing.*;  // JPanel
import java.awt.*;     // BoxLayout
import java.util.*;    // List, ArrayList

public class PanelContactos extends JPanel {

  //java.util.List<JLabel> listOfLabels = new ArrayList<JLabel>();
  MisContactos contactos;

  public PanelContactos(MisContactos c) {

    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    contactos = c;

    /*
    for(int i=0; i<2; i++) {
      addContact("Label "+i, "img/brown_woman.png");
    }
    */

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
  public void addContact(String nombre, String strImg) {
    ImageIcon icon;
    JLabel lblNombre; 
    
    // Para redimencionar una imagen hacemos lo siguiente
    ImageIcon originalImage;
    Image resizeImage;

    originalImage = new ImageIcon(strImg);
    // Aquí se redimenciona la imagen
    resizeImage = originalImage.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
    icon = new ImageIcon(resizeImage);

    // Se genera la etiqueta con la imagen
    lblNombre = new JLabel(nombre, icon, JLabel.LEFT);

    //listOfLabels.add( lblNombre );

    this.add( lblNombre );
    // Esto actualiza la vista en el JPanel
    // con las nueva etiqueta
    this.revalidate();
  }

}

