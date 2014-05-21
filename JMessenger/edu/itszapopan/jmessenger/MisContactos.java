package edu.itszapopan.jmessenger;

public class MisContactos {

  private java.util.List<Contacto> lstContactos;

  public MisContactos() {
    lstContactos = new java.util.ArrayList<Contacto>();
  }

  /** Agerga un nuevo contacto **/
  public void add(String nombre, String strImg, String strIP) {
    Contacto ctt;
    ctt = new Contacto(nombre, strImg, strIP);

    lstContactos.add( ctt );

  }

}


