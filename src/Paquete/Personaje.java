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
    // Reduce los puntos de vida del personaje
    public void bajarVida(int cantidad) {
        // Si está protegido, el daño se reduce a la mitad
        if (protegido) {
            cantidad = cantidad / 2;
            System.out.println(nombre + " está protegido! El daño se reduce a " + cantidad);
        }
        
        puntosVida = puntosVida - cantidad;
        
        // Los puntos de vida no pueden ser negativos
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        
        System.out.println(nombre + " recibe " + cantidad + " de daño. Vida restante: " + puntosVida);
    }
    
    // Aumenta los puntos de vida del personaje
    public void curar(int cantidad) {
        puntosVida = puntosVida + cantidad;
        System.out.println(nombre + " se cura " + cantidad + " puntos. Vida actual: " + puntosVida);
    }
    


}
