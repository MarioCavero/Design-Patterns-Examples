
public class RubberDuck extends Duck{

	public RubberDuck() {
		this.flybehavior=new FlyNoWay();
		this.quackbehavior=new QuackNoWay();
		this.display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi, I'm a rubber Duck and I swim in the bathtub");
	}

}
