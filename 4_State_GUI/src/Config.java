
public class Config implements States{

	UserInterface inter;
	boolean CID;
	
	public Config(UserInterface userInterface) {
		// TODO Auto-generated constructor stub
		this.inter=userInterface;
		this.CID=false;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		if(CID==true) {
			inter.setState(inter.getResults());
			CID=false;
		}
		else System.out.println("CID is empty");
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("not possible. Already in config");
		
	}

	@Override
	public void setCID(boolean CID) {
		// TODO Auto-generated method stub
		this.CID=CID;
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String descripcion="Config";
		return descripcion;
	}

}
