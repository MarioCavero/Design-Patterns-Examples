
public class Library {

	AlarmaLibro alarma;
	
	
	public Library() {
		this.alarma=new AlarmaLibro();
	}
	public void returnBook(Libro libro) {
		if(libro.isDamaged)
			alarma.insertDamaged(libro);
	}
		
	public AlarmaLibro getAlarma() {
		return this.alarma;
	}
}
