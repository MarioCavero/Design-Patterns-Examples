
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TransistorFactory factoriaPNP=new FactoryPNP();
		TransistorFactory factoriaNPN=new FactoryNPN();
		
		Store tienda=new Store(factoriaPNP);
		tienda.orderTrans(5);
		tienda.orderTrans(12);
		System.out.println();
		tienda.setFactory(factoriaNPN);
		tienda.orderTrans(5);
		tienda.orderTrans(12);
	}

}
