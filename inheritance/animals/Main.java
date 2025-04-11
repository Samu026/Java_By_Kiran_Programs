/* Create a class Animal with a method eat(). 
 * Inherit a class Dog that has a method bark(). 
 * Call both methods from the Dog class object.
 */

package inheritance.animals;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();

		System.out.println("Animals food :" + d.eat("Pedigree"));
		System.out.println("Dog Bark :" + d.bark("Bark! Bark!"));
	}
}
