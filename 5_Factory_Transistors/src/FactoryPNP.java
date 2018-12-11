
public class FactoryPNP extends TransistorFactory{

	@Override
	public Transistor fabricarCrearTransistor(int vol) {
		// TODO Auto-generated method stub
		Transistor transistor=new TransistorPNP(vol);
		return transistor;
	}

}
