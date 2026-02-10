
public class equipamento {
	// Atributos (variables que pertenecen al objeto)
    private String nombre;  // Nombre del objeto
    private String tipo;    // Tipo: arma, armadura, etc.
    
    // Constructor - Se ejecuta cuando creamos un nuevo Equipamiento
    // Ejemplo: new Equipamiento("Espada", "arma")
    public equipamento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
}
