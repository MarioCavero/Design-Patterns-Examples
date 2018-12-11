/*Dont look at this class the first thing! We create a Duck but we first need to know that
 * all ducks have a Flying and Quack behavior. That is our Strategy Pattern. Not only that, but
 * if we create other classes (other animals, like birds, i.e), they can also implement these methods. 
 * 
*/
public abstract class Duck {
//Every Duck has a fly and quack behavior
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	
	//And every type of duck will implement its own constructor
	
	public Duck() {
		
	}
	//It is abstract, as every type of duck will display differently. 
	public abstract void display();
	
	//The duck will be call to fly, but we need to see a specific type of Duck to see what's happening
	public void performFly() {
		this.flybehavior.fly();
	}
	public void performQuack() {
		this.quackbehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks can swim");
	}
}
