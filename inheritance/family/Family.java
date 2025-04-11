package inheritance.family;

public class Family {
	public static void main(String[] args) {
		Father f = new Father();
		
		System.out.println("======== Father and Grand-Father Properties =======");
		
		/* Method Calling via creating object of child class.
		 * Though the entends keyword aquire properties of parent class in child class
		 * that's why we create object of child class, then come property of child also 
		 * and grandfather also */
		
		f.gProperty();  
		f.gAppearance();
		
		System.out.println();
		System.out.println("================= Father Property =================");
		
		System.out.println("Father property : "+f.fProperty);
	}
}
