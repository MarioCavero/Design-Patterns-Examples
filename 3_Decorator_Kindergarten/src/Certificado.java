
public class Certificado extends Recompensa{

	Certificado(Kid nene) {
		super(nene);
	}
	public String getDescription() {
		return(recompensa.getDescription()+ ", Certificado ");
	}
	

}
