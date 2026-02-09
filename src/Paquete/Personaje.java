package Paquete;

public class Personaje {
	 // Atributos protegidos (pueden ser usados por las clases hijas)
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected boolean protegido;
    private Inventario inventario;
    
    // Constructor - Crea un nuevo personaje
    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.protegido = false;  // Al inicio no está protegido
        this.inventario = new Inventario();  // Crea un inventario vacío
    }
    public void Mostrar_Info() {
    	System.out.println("------------------------");
    }
}
