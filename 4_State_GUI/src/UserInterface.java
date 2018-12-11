
public class UserInterface {

	States portada;
	States results;
	States config;
	
	States currentState;
	
	public UserInterface() {
		this.portada=new Portada(this);
		this.results=new Results(this);
		this.config=new Config(this);
		
		this.currentState=portada;
	}
	
	public void activate() {
		currentState.activate();
	}
	public void configurate() {
		currentState.config();
	}
	public void type() {
		currentState.setCID(true);
	}
	public void display() {
		System.out.println("You are in "+this.currentState.getDescription());
	}
	public void setState(States state) {
		this.currentState=state;
	}
	public States getPortada() {
		return this.portada;
	}
	public States getResults() {
		return this.results;
	}
	public States getConfig() {
		return this.config;
	}
}
