
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beverage cafe1=new Espresso();
		cafe1=new Mocha(cafe1);
		System.out.println(cafe1.getDescription()+ " with cost: "+cafe1.cost());
		
		Beverage cafe2=new HouseBlend();
		cafe2=new Soy(cafe2);
		cafe2=new WhippedCream(cafe2);
		cafe2=new WhippedCream(cafe2);
		System.out.println(cafe2.getDescription()+ " with cost: "+cafe2.cost());
	}

}
