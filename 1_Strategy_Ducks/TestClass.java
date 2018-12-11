
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck mallard= new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		System.out.println();
		Duck injured= new WingInjuredDuck();
		injured.performFly();
		injured.performQuack();
		System.out.println();
		Duck rubber= new RubberDuck();
		rubber.performFly();
		rubber.performQuack();
	}

}
