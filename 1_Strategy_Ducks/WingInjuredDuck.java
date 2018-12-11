
public class WingInjuredDuck extends Duck{

	public WingInjuredDuck() {
		this.flybehavior=new FlyNoWay();
		this.quackbehavior=new Squeak();
		this.display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am an injured Duck. My wings are injured and my quacks are weird");
	}

}
