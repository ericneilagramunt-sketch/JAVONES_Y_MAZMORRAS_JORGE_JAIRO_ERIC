package Paquete;

public class Guerrero {

 private Personaje CompañeroProtegido;
 
 
 public Guerrero() {
	 this.CompañeroProtegido = null;
 }
 
 public void proteger(Personaje compañero) {
	 this.CompañeroProtegido = compañero;
 }
}
