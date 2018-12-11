
public class Library {

	private AlarmaLibro alarma;
	
	public Library() {
		this.alarma=new AlarmaLibro();
	}
	public void returnBook(Libro libro) {
		boolean isDamaged=libro.isDamaged();
		if(isDamaged) {
			alarma.insertBook(libro);
		}
	}
	public AlarmaLibro getAlarma() {
		return this.alarma;
	}
}
