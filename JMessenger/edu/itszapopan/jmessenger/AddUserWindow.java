package edu.itszapopan.jmessenger;

import javax.swing.*;
import java.awt.*;

public class AddUserWindow extends JDialog {

  private JTextField txtNombre;
  private JTextField txtImagen;
  private JTextField txtIP;

  public AddUserWindow (Frame owner) {
    super(owner,"Agregar Usuarios", true);

    this.setLayout( new GridLayout(5,2,10,10) );

    txtNombre = new JTextField();
    txtImagen = new JTextField();
    txtIP     = new JTextField();

    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel("Nombre: "));
    add(txtNombre);
    add(new JLabel("Imagen: "));
    add(txtImagen);
    add(new JLabel("Dirección IP: "));
    add(txtIP);
    add(new JLabel(""));
    add(new JLabel(""));

    pack();
    setVisible(true);

  }
}

