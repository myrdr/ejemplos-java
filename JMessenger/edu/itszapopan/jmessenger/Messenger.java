package edu.itszapopan.jmessenger;

public class Messenger {

  public static void main(String []args) {
     
     java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
	   // Este método se genera de esta forma para asegurar un 
	   // comportamiento seguro en los hilos "thread safety".
	   // Esto será invocado desde el hilo desachador de eventos 
	   // "event-dispatching thread".
	   // In Swing you must execute all code that modifies the user
	   // interface in the event dispatching thread.
	   new VentanaPrincipal("Mensajes por Java").setVisible(true);
	 }		 
       }
     );
  }
}

