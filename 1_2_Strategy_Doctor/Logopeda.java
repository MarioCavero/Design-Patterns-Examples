//a type of doctor
public class Logopeda extends Doctor{

	@Override
	public void examinePatient(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Logopedian has examined "+name);
	}

	@Override
	public void sendBillToParents(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Logopedian has sent the bills to "+name+"'s parents");
	}

	@Override
	public void sendResultsToParents(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Logopedian has sent the results to "+name+"'s parents");
	}

}
