
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData weatherData=new WeatherData();
		
		CurrentConditionDisplay condition= new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(5, 4, 1);
		weatherData.setMeasurements(3, 6, 1);
		weatherData.setMeasurements(2, 2, 1);
	}

}
