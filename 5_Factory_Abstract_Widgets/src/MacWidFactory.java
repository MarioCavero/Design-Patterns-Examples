
public class MacWidFactory implements WidAbstractFactory{

	@Override
	public List createList() {
		// TODO Auto-generated method stub
		return new MacList();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public Scrollbar createScrollbar() {
		// TODO Auto-generated method stub
		return new MacScrollbar();
	}

}
