
public abstract class CaffeineBeverage {
//final, so our classes that extend from caffeineBeverage cannot override it
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	public abstract void brew();
	public abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling water in a generic way!");
	}
	public void pourInCup() {
		System.out.println("Pouring in cup in a generic way!");
	}
}
