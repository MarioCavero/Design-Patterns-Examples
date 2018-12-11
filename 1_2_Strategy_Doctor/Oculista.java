//a type of doctor
public class Oculista extends Doctor {

	@Override
	public void examinePatient(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Cculist has examined "+name);
	}

	@Override
	public void sendBillToParents(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Oculist has sent the bills to "+name+"'s parents");
	}

	@Override
	public void sendResultsToParents(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Oculist has sent the results to "+name+"'s parents");
	}

}
