
public class Kid {
	String nombre;
	
	 Kid(String nombre){
		this.nombre=nombre;
	}
	public String getDescription() {
		return("El nene "+nombre+" tiene las recompensas: ");
	}
	
	public Kid resetearNene() {
		return this;
	}
	public void getNombreLibro() {
		
		System.out.println("No tiene libro");
	}
	public boolean isLibro() {
		return false;
	}
}
