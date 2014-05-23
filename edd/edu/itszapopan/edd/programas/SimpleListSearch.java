package edu.itszapopan.edd.programas;

import edu.itszapopan.edd.listas.*;
import java.util.Scanner;

public class SimpleListSearch {

   public static void main(String []args) {
      LinkedList ll;
      Scanner teclado;
      int numero;

      teclado = new Scanner(System.in);
      ll = new LinkedList();

      System.out.println("Linked List Program\n");
      System.out.println("Please type any number you want (0 to finish).");

      do  {
        System.out.print("Number: ");
	numero = teclado.nextInt();

	if (numero != 0) {
	  ll.insertIni(numero);
	} 

      } while(numero != 0);

      System.out.println("\n******");
      System.out.print("The list is: ");

      ll.rewind();
      while( ll.next() ) {
	 System.out.print( ll.get() + ", ");
      }
      System.out.println();

      System.out.print("Please type a number: ");
      numero = teclado.nextInt();

      if ( ll.find(numero) ) {
        System.out.println("The number was found.");
      } else {
        System.out.println("The "+ number +" was NOT found.");
      }

   }

}

