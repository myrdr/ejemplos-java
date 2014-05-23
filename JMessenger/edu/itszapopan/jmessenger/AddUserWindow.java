package edu.itszapopan.jmessenger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddUserWindow extends JDialog implements ActionListener {

  private JTextField txtNombre;
  private JTextField txtImagen;
  private JTextField txtIP;
  private JButton    btnOK, btnCancel;

  public AddUserWindow (Frame owner) {
    super(owner,"Agregar Usuarios", true);

    this.setLayout( new GridLayout(4,2,10,10) );
    JLabel space = new JLabel(" ** ");

    txtNombre = new JTextField();
    txtImagen = new JTextField();
    txtIP     = new JTextField();

    btnOK = new JButton("Aceptar");
    btnCancel = new JButton("Cancelar");

    add(new JLabel("Nombre: "));
    add(txtNombre);

    add(new JLabel("Imagen: "));
    add(txtImagen);

    add(new JLabel("Dirección IP: "));
    add(txtIP);

    add(btnOK);
    add(btnCancel);

    //Handle window closing correctly.
    /*
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            }
        });
    */

    pack();
    setVisible(true);

  }

  public void actionPerformed(ActionEvent e) {
  }


}

