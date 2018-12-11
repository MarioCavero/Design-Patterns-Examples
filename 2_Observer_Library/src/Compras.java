
public class Compras implements DisplayInfo, Observer{

	private Libro libro;
	private Subject alarm;
	public Compras(Subject alarm) {
		this.alarm=alarm;
		this.alarm.registerObserver(this);
	}
	@Override
	public void update(Libro libro) {
		// TODO Auto-generated method stub
		this.libro=libro;
		display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		String title=this.libro.getTitle();
		System.out.println("The compras has been notified: "+title);
	}
}
