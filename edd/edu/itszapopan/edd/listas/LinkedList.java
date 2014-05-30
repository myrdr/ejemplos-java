package edu.itszapopan.edd.listas;

public class LinkedList {

  private Node header;
  private Node tmp;

  /**
   * Constructor.
   */
  public LinkedList() {
     header = new Node(-1);
  }

  /**
   * Insert at end of the List.
   */
  public void insertAtEnd(float data) {
    Node newNode;
    newNode = new Node(data);

    tmp = header;

    while (tmp.getNext() != null) {
       tmp = tmp.getNext();
    }
    tmp.setNext( newNode );
  }

  /**
   * Insert at the begining of the List.
   */
  public void insertIni(float data) {
    Node newNode;
    newNode = new Node(data);
    
    newNode.setNext( header.getNext()  );
    header.setNext( newNode );

  }

  /**
   * Insert after other element.
   */
  public void insertAfter(float prev, float data) {
    Node newNode;
    newNode = new Node(data);
    boolean found = false;
    
    tmp = header;

    while (tmp.getNext() != null) {
       tmp = tmp.getNext();
       if (tmp.getData() == prev) {
	  found = true;
          break;
       }
    }

    if (found) {
      newNode.setNext( tmp.getNext()  );
      tmp.setNext( newNode );
    }

  }

  /**
   * Rewind the list to begining.
   */
  public void rewind(){
    tmp = header;
  }

  /**
   * Advance one node on the list
   */
  public boolean next(){
    boolean  isNext = false;

    if (tmp.getNext() != null) {
      tmp = tmp.getNext();
      isNext=true;
    } 

    return isNext;
  }

  /**
   * Give the data from current pointer element.
   */
  public float get()  {
    if (tmp == header) {
      tmp = header.getNext();
    }
    if (tmp == null) {
       return 0;
    }
    return tmp.getData();
  }

  /**
   * Return true if a number is found in the list.
   */
  public boolean find(float number)  {

    tmp = header;

    while (tmp.getNext() != null) {
       tmp = tmp.getNext();
       if (tmp.getData() == number) {
         return true;
       }
    }
    return false;

  }

  /**
   * Delete an element of the list
   */
  public void  delete(float number)  {
    tmp = header;
    Node toDelete;

    if (tmp.getNext() != null) {
      // There is at least one element
      while (tmp.getNext() != null) {
         if (tmp.getNext().getData() == number) {
	   // Como dijo Abril: Que lo borre
	   toDelete = tmp.getNext();
	   tmp.setNext( toDelete.getNext()  );
	   //tmp.setNext( tmp.getNext().getNext()  );
	   toDelete = null; // This is like erase.
	   break;
         }
         tmp = tmp.getNext();
      }
    }
  }

}






