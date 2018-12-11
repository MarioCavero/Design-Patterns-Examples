

public abstract class Recompensa extends Kid {
	Kid recompensa;
	
	//constructor
	Recompensa( Kid nene ) {
		super(nene.nombre);//
		this.recompensa=nene;
	}
	public abstract String getDescription();
	
	public void getNombreLibro() {
		recompensa.getNombreLibro();
	}
	public boolean isLibro() {
		return recompensa.isLibro();
	}
	public  Kid resetearNene() {
		return recompensa.resetearNene();
	}
}
