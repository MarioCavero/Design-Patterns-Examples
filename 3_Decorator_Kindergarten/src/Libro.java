import java.util.*;

public class Libro extends Recompensa {
	String nombreLibro;
	Libro(Kid nene, String nombre){
		super(nene);
		if(nene.isLibro()) throw new EmptyStackException();
		nombreLibro=nombre;
	}
	public String getDescription() {
		return(recompensa.getDescription()+ ", Libro ");
	}
	
	public void getNombreLibro() {
		
		System.out.println("Titulo del Libro: "+nombreLibro);
	}
	public boolean isLibro() {
		return true;
	}
}