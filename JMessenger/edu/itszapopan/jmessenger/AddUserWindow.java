package edu.itszapopan.jmessenger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddUserWindow extends JDialog implements ActionListener {

  private JTextField txtNombre;
  //private JTextField txtImagen;
  private JTextField txtIP;
  private JButton    btnOK, btnCancel, btnImagen;
  private JLabel     lblImagen, lblImagenPath;
  private JLabel     lblNombre, lblIP;
  private JFileChooser fileChooser;

  public AddUserWindow (Frame owner) {
    super(owner,"Agregar Usuarios", true);

    JPanel pnlImagen;
    FileNameExtensionFilter filter;

    //this.setLayout( new GridLayout(4,2,10,10) );
    JLabel space = new JLabel(" ** ");

    txtNombre = new JTextField();
    //txtImagen = new JTextField();
    txtIP     = new JTextField();

    lblNombre = new JLabel("Nombre: ");
    lblImagen = new JLabel("Imagen: ");
    lblIP     = new JLabel("IP: ");

    btnOK = new JButton("Aceptar");
    btnCancel = new JButton("Cancelar");

    pnlImagen = new JPanel();
    btnImagen = new JButton("Añadir imagen",
		    		createImageIcon("img/Open16.gif") );
    lblImagenPath = new JLabel();

    fileChooser = new JFileChooser();
    filter = new FileNameExtensionFilter(
        "Formatos de Imagen", "jpg", "gif", "png" );
    fileChooser.setFileFilter(filter);

    //http://docs.oracle.com/javase/tutorial/uiswing/layout/group.html
    GroupLayout layout = new GroupLayout(this.getContentPane());
    this.getContentPane().setLayout(layout);
 
    // Turn on automatically adding gaps between components
    layout.setAutoCreateGaps(true);
 
    // Turn on automatically creating gaps between components that touch
    // the edge of the container and the container.
    layout.setAutoCreateContainerGaps(true);

    // Create a sequential group for the horizontal axis.
 
    GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
 
    // The sequential group in turn contains two parallel groups.
    hGroup.addGroup(layout.createParallelGroup()
            .addComponent(lblNombre)
            .addComponent(lblImagen)
	    .addComponent(lblIP)
	    );
    hGroup.addGroup(layout.createParallelGroup()
            .addComponent(txtNombre)
            .addComponent(btnImagen)
	    .addComponent(txtIP)
	    );

    layout.setHorizontalGroup(hGroup);
   
    // Create a sequential group for the vertical axis.
    GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
 
    // The sequential group contains two parallel groups that align
    // the contents along the baseline. The first parallel group contains
    // the first label and text field, and the second parallel group contains
    // the second label and text field. By using a sequential group
    // the labels and text fields are positioned vertically after one another.
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	   .addComponent(lblNombre)
	   .addComponent(txtNombre) );
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
           .addComponent(lblImagen)
	   .addComponent(btnImagen) );
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
           .addComponent(lblIP)
	   .addComponent(txtIP) );
    layout.setVerticalGroup(vGroup);


    //Uncomment one of the following lines to try a different
    //file selection mode.  The first allows just directories
    //to be selected (and, at least in the Java look and feel,
    //shown).  The second allows both files and directories
    //to be selected.  If you leave these lines commented out,
    //then the default mode (FILES_ONLY) will be used.
    //
    //fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    
    btnCancel.addActionListener(this);
    btnOK.addActionListener(this);
    btnImagen.addActionListener(this);

    //pnlImagen.add(btnImagen);
    //pnlImagen.add(lblImagenPath);


    /*
    add(new JLabel("Nombre: "));
    add(txtNombre);

    add(new JLabel("Imagen: "));
    add(pnlImagen);

    add(new JLabel("Dirección IP: "));
    add(txtIP);

    add(btnOK);
    add(btnCancel);
    */

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
    if (e.getSource() == btnImagen) {

      int returnVal = fileChooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION ) {
         File fImg = fileChooser.getSelectedFile();
	 lblImagenPath.setText(fImg.getPath() + "/" + fImg.getName());
    	 this.revalidate();
	 this.pack();
      }

    } else if (e.getSource() == btnOK) {

    } else { //if (e.getSource() == btnCancel) {

    }
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

