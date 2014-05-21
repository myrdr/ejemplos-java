package edu.itszapopan.jmessenger;

public class Contacto {

  private String nombre;
  private String imagen;
  private String IP;

  public Contacto(String strNombre, String strImagen, String strIP) {
    nombre = strNombre;
    imagen = strImagen;
    IP = strIP;
  }

  public String getNombre() {
    return nombre;
  }

  public String getImagen() {
    return imagen;
  }

  public String getIP() {
    return IP;
  }

  public void setNombre(String strNombre) {
    nombre = strNombre;
  }

  public void setImagen(String strImagen) {
    imagen = strImagen;
  }

  public void setIP(String strIP) {
    IP = strIP;
  }


}

