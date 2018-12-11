
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WidAbstractFactory windowsFactory=new WinWidFactory();
		WidAbstractFactory macFactory=new MacWidFactory();
		InterfaceCreator interfaz=new InterfaceCreator(windowsFactory);
		interfaz.createWebPage();
		System.out.println("");
		interfaz.setFactory(macFactory);
		interfaz.createWebPage();
	}

}
