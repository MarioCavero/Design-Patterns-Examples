
public class WhippedCream extends CondimentDecorator{

	Beverage beverage;
	public WhippedCream(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Whipped cream";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.40+beverage.cost();
	}
}
