package Paquete;

public class Mago {

public class Mago extends Personaje{
// Atributo adicional del Mago
    private int mana;
    
    // Constructor - Crea un nuevo Mago
    // "super" llama al constructor de la clase padre (Personaje)
    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);  // Llama al constructor de Personaje
        this.mana = mana;
    }
    public void lanzarHechizo(int costeMana){
        System.out.println(nombre + " intenta lanzar un hechizo...");
        
        // Verifica si hay maná suficiente
        if (mana >= costeMana) {
            mana = mana - costeMana;
            System.out.println("¡Hechizo lanzado! Maná restante: " + mana);
        } else {
            System.out.println("¡No hay maná suficiente! Maná actual: " + mana);
        }
    }
     // Recarga el maná del mago
    public void recargarMana(int cantidad) {
        mana = mana + cantidad;
    System.out.println(nombre + " recarga " + cantidad + " de maná. Maná actual: " + mana);
    }
    
    // Devuelve el maná actual
    public int getMana() {
        return mana;
    }
    
    
}
