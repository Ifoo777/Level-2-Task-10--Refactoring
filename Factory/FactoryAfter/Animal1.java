package FactoryAfter;

//Create an animal1 class
public class Animal1 implements Animal {
	@Override
	public void create() {
		System.out.println("You've just created a cheetah!");
	}
}
