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

}






