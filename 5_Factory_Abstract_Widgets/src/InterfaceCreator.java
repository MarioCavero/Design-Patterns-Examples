
public class InterfaceCreator {

	WidAbstractFactory factory;
	public InterfaceCreator(WidAbstractFactory factory) {
		this.factory=factory;
	}
	public void createWebPage() {
		factory.createButton();
		factory.createList();
		factory.createList();
		factory.createButton();
		factory.createScrollbar();
	}
	public void setFactory(WidAbstractFactory factory) {
		this.factory=factory;
	}
}
