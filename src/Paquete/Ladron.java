package Paquete;

public class Ladron extends Personaje {
	 // Atributo adicional: si está invisible
    private boolean invisible;
    
    // Constructor - Crea un nuevo Ladrón
    public Ladron(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.invisible = false;  // Al inicio no está invisible
    }
    
}
