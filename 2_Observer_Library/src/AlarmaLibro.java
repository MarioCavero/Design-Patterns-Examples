import java.util.ArrayList;

public class AlarmaLibro implements Subject{

	private Libro libro;
	private ArrayList<Observer> observadores;
	
	public AlarmaLibro() {
		observadores=new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observadores.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int index=observadores.indexOf(o);
		observadores.remove(index);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0;i<observadores.size();i++) {
			Observer observador=observadores.get(i);
			observador.update(libro);
		}
	}
	
	public void insertBook(Libro libro) {
		this.libro=libro;
		this.notifyObservers();
	}

}
