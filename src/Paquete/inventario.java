import java.util.ArrayList;

// Clase Inventario - Almacena el equipamiento de un personaje
public class Inventario {
    // Atributo: lista de equipamiento
    // ArrayList es como una lista que puede crecer automáticamente
    private ArrayList<Equipamiento> equipamiento;
    
    // Constructor - Crea un inventario vacío
    public Inventario() {
        equipamiento = new ArrayList<Equipamiento>();
    }
    
    // Método para agregar un objeto al inventario
    public void agregarEquipamiento(Equipamiento equipo) {
        equipamiento.add(equipo);  // Añade el objeto a la lista
        System.out.println("Se ha añadido: " + equipo.getNombre());
    }
    
    // Método para mostrar todos los objetos del inventario
    public void mostrarInventario() {
        System.out.println("=== INVENTARIO ===");
        
        // Si el inventario está vacío
        if (equipamiento.isEmpty()) {
            System.out.println("El inventario está vacío");
        } else {
            // Recorre cada objeto del inventario
            for (Equipamiento equipo : equipamiento) {
                System.out.println("- " + equipo.getNombre() + " (" + equipo.getTipo() + ")");
            }
        }
        System.out.println("==================");
    }
}
  
