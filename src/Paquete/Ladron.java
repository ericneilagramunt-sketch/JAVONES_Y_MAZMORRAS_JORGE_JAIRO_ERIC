package Paquete;

public class Ladron {
	
	private boolean invisible;
	
	public void ladron() {
	
	this.invisible = false;


}

public void hacerseinvisible() {
	
	this.invisible = !this.invisible;
	
	if (this.invisible){
		System.out.println("El ladron es invisible");
	}
	
	else {
		System.out.println("El ladron ya no es invisible");
	}
	}

  public boolean estainvisible() {
	return this.invisible;
}
}