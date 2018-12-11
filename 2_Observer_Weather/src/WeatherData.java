import java.util.ArrayList;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers=new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int index=observers.indexOf(o);
		if(index>=0)
			observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++) {
			Observer observer=(Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	public void measurementsChanged() {
		notifyObservers();
	}
	public void setMeasurements(float temp, float hum, float press) {
		temperature=temp;
		humidity=hum;
		pressure=press;
		measurementsChanged();
	}

}
