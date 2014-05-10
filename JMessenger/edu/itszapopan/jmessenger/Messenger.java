package edu.itszapopan.jmessenger;

public class Messenger {

  public static void main(String []args) {
     
     java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
	   new VentanaPrincipal("Mensajes por Java").setVisible(true);
	 }		 
       }
     );
  }
}

