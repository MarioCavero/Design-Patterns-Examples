
public class Administration implements DisplayInfo, Observer{

	private Libro libro;
	private Subject alarma;
	public Administration(Subject alarma) {
		this.alarma=alarma;
		this.alarma.registerObserver(this);
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
		String title=libro.getTitle();
		System.out.println("The administration has been notified of: "+title);
	}

}
