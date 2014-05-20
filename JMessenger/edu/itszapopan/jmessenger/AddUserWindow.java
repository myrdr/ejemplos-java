package edu.itszapopan.jmessenger;

import javax.swing.*;
import java.awt.*;

public class AddUserWindow extends JDialog {

  private JTextField txtNombre;
  private JTextField txtImagen;
  private JTextField txtIP;
  private JButton    btnOK, btnCancel;

  public AddUserWindow (Frame owner) {
    super(owner,"Agregar Usuarios", true);

    this.setLayout( new GridLayout(7,2,10,10) );
    JLabel space = new JLabel();

    txtNombre = new JTextField();
    txtImagen = new JTextField();
    txtIP     = new JTextField();

    btnOK = new JButton("Aceptar");
    btnCancel = new JButton("Cancelar");

    add(space); add(space);

    add(new JLabel("Nombre: "));
    add(txtNombre);

    add(new JLabel("Imagen: "));
    add(txtImagen);

    add(new JLabel("Dirección IP: "));
    add(txtIP);

    add(space); add(space);

    add(btnOK);
    add(btnCancel);

    pack();
    setVisible(true);

  }
}

