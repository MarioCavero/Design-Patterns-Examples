
public class TransistorPNP extends Transistor{

	int vol;
	public TransistorPNP(int vol) {
		this.vol=vol;
		System.out.println("Fabricando transistor PNP de "+vol+" voltios");
	}
}
