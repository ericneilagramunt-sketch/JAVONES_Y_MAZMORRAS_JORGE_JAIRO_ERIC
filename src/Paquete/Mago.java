package Paquete;

public class Mago {

public class Mago extends Personaje{
    //objeto unico del mago
    private int mana;
 // Constructor - Crea un nuevo Mago
    // "super" llama al constructor de la clase padre (Personaje)
    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);  // Llama al constructor de Personaje
        this.mana = mana;
    }
}
