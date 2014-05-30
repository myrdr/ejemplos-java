package edu.itszapopan.jmessenger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

public class AddUserWindow extends JDialog implements ActionListener {

  private JTextField txtNombre;
  private JTextField txtIP;
  private JButton    btnOK, btnCancel, btnImagen;
  private JLabel     lblImagen, lblImagenPath;
  private JLabel     lblNombre, lblIP;
  private JFileChooser fileChooser;

  private VentanaPrincipal venPrin;

  public AddUserWindow (VentanaPrincipal owner) {
    super(owner,"Agregar Usuarios", true);
    venPrin = owner;

    FileNameExtensionFilter filter;
    GroupLayout layout;

    txtNombre = new JTextField();
    txtIP     = new JTextField();

    lblNombre = new JLabel("Nombre: ");
    lblImagen = new JLabel("Imagen: ");
    lblIP     = new JLabel("IP: ");

    btnOK = new JButton("Aceptar");
    btnCancel = new JButton("Cancelar");

    btnImagen = new JButton("Añadir imagen",
		    		createImageIcon("img/Open16.gif") );
    lblImagenPath = new JLabel();

    fileChooser = new JFileChooser();
    filter = new FileNameExtensionFilter(
        "Formatos de Imagen", "jpg", "gif", "png" );
    fileChooser.setFileFilter(filter);

    //http://docs.oracle.com/javase/tutorial/uiswing/layout/group.html
    layout = new GroupLayout(this.getContentPane());
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
	    .addComponent(btnOK,GroupLayout.Alignment.TRAILING)
	    );
    hGroup.addGroup(layout.createParallelGroup()
            .addComponent(txtNombre)
            .addComponent(btnImagen)
            .addComponent(lblImagenPath)
	    .addComponent(txtIP, 64,128,130)
	    .addComponent(btnCancel)
	    );

    layout.setHorizontalGroup(hGroup);
   
    // Create a sequential group for the vertical axis.
    GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
 
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	   .addComponent(lblNombre)
	   .addComponent(txtNombre) );
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
           .addComponent(lblImagen)
	   .addComponent(btnImagen) );
    vGroup.addComponent(lblImagenPath);
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
           .addComponent(lblIP)
	   .addComponent(txtIP) );
    vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
           .addComponent(btnOK)
	   .addComponent(btnCancel) );
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

    //Handle window closing correctly.
    /*
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            }
        });
    */

    pack();

    // Poner al centro de la pantalla
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2,
		     dim.height/2-this.getSize().height/2);

    setResizable(false);
    setVisible(true);

  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnImagen) {

      int returnVal = fileChooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION ) {
         File fImg = fileChooser.getSelectedFile();
	 lblImagenPath.setText(fImg.getPath());
    	 //this.revalidate();
	 this.pack();
      }

    } else if (e.getSource() == btnOK) {

       if (txtNombre.getText().length() == 0  ||
               txtIP.getText().length() == 0 
	    || lblImagenPath.getText().length() == 0
	       )
       {
         JOptionPane.showMessageDialog(this,
           "Error: Faltan datos por completar",
           "Datos incompletos",
           JOptionPane.ERROR_MESSAGE);
       } else {
	 // Agregamos el contacto
	 venPrin.getPanelContactos().addContact(txtNombre.getText(),
			 lblImagenPath.getText()
			 );
	 venPrin.revalidate();
         this.setVisible(false);
         this.dispose();
       }
    } else { //if (e.getSource() == btnCancel) {
      this.setVisible(false);
      this.dispose();
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

