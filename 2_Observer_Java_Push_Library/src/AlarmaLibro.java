import java.util.Observable;

public class AlarmaLibro extends Observable{

	private Libro libro=new Libro();
	
	public void newNotify() {
		setChanged();//important. If we dont do "setChanged()", our notify is not gonna notify.
		notifyObservers(libro);//push
	}
	public void insertDamaged(Libro libro) {
		this.libro=libro;
		newNotify();
	}
	public Libro getBook() {
		return this.libro;
	}
	
}
