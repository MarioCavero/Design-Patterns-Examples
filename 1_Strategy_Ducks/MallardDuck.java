
public class MallardDuck extends Duck{

	public MallardDuck() {
		//We are implementing the FlyWithWings. 
		//in the Main: Duck duck1=new MallardDuck();
		//Then duck1 will be able to do "flywithwings" just by calling duck1.performFly
		this.flybehavior=new FlyWithWings();
		
		this.quackbehavior=new QuackWithMouth();
		
		this.display();
	}
	
	//And the Overriden method of display.
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Im a mallard Duck!");
	}

}
