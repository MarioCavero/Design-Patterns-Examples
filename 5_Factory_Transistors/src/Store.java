
public class Store {

	Transistor transistor;
	TransistorFactory factory;
	public Store(TransistorFactory factory) {
		this.factory=factory;
	}
	public void orderTrans(int volt) {
		this.transistor=factory.crearTransistor(volt);
	}
	
	public void setFactory(TransistorFactory factory) {
		this.factory=factory;
	}
}
