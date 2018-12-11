
public abstract class TransistorFactory {

	public Transistor crearTransistor(int vol) {
		Transistor transistor=fabricarCrearTransistor(vol);
		transistor.encapsulacion();
		transistor.montaje();
		return transistor;
	}
	public abstract Transistor fabricarCrearTransistor(int vol);
}
