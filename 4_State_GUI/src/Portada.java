
public class Portada implements States{

	UserInterface inter;
	boolean CID;
	
	public Portada(UserInterface inter) {
		this.inter=inter;
		this.CID=false;
	}
	@Override
	public void activate() {
		// TODO Auto-generated method stub
		if(CID==true) {
			inter.setState(inter.getResults());
			CID=false;
		}
		else System.out.println("CID is empty.");
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		inter.setState(inter.getConfig());
	}

	@Override
	public void setCID(boolean CID) {
		// TODO Auto-generated method stub
		this.CID=CID;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String descripcion="Portada";
		return descripcion;
	}

}
