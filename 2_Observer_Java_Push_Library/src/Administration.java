import java.util.Observable;
import java.util.Observer;

public class Administration implements Observer, DisplayInfo{

	private Libro libro=new Libro();
	private Observable observable;

	public Administration(Observable observable) {
		this.observable=observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Administration notified "+libro.title);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.libro=(Libro)arg;
		display();
		
		/*Filosofia pull
		 * if (obs instanceof AlarmaLibro) {
			AlarmaLibro alarmaLibro = (AlarmaLibro) obs;
			libro = alarmaLibro.getLibro();
			display();
		}
		 * 
		 * */
	}
	
}
