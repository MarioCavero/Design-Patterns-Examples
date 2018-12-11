
public class FactoryNPN extends TransistorFactory{

	@Override
	public Transistor fabricarCrearTransistor(int vol) {
		// TODO Auto-generated method stub
		Transistor transistor=new TransistorNPN(vol);
		return transistor;
	}

}
