
public class TransistorNPN extends Transistor{

	int vol;
	public TransistorNPN(int vol) {
		this.vol=vol;
		System.out.println("Fabricando transistor NPN de "+vol+" voltios");
	}
}
