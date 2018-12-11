import java.util.Observable;
import java.util.Observer;

public class Compras implements Observer, DisplayInfo{

	private Libro libro=new Libro();
	private Observable observable;
	public Compras(Observable observable) {
		this.observable=observable;
		this.observable.addObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Compras has been notified: "+libro.title );
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.libro=(Libro)arg;
		display();
	}

}
