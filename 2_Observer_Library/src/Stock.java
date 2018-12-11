
public class Stock implements Observer, DisplayInfo{

	private Libro libro;
	private Subject alarmSubject;
	
	public Stock(Subject alarmi) {
		this.alarmSubject=alarmi;
		//we can register it as it implements Observer. So just with "this", works. 
		this.alarmSubject.registerObserver(this);
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
		System.out.println("The Stock has been notified of a damaged book: "+title);
	}



}
