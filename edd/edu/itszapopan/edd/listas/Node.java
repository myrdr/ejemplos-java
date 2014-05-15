package edu.itszapopan.edd.listas;

public class Node {

   private Node next;
   private float  data;

   //Constructor
   public Node(float d) {
     data = d;
     next = null;
   }

   /**
    * Return the next Node.
    */
   public Node getNext() {
     return next;
   }

   /**
    * Return de data of the Node.
    */
   public float getData() {
     return data;
   }

   public void setNext(Node n) {
     next = n;
   }

   public void setData(float d) {
     data = d;
   }
}

