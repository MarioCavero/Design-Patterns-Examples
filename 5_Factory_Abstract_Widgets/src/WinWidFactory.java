
public class WinWidFactory implements WidAbstractFactory{

	@Override
	public List createList() {
		// TODO Auto-generated method stub
		return new WinList();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public Scrollbar createScrollbar() {
		// TODO Auto-generated method stub
		return new WinScrollbar();
	}

}
