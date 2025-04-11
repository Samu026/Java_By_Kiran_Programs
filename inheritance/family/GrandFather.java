package inheritance.family;

public class GrandFather {

	double gMoney = 1000000;
	String gProperty = "5 ACR";
	String gHairColor = "Black";

	public void gProperty() {
		System.out.println("Grand Father Money     : " + gMoney);
		System.out.println("Grand Father Property  : " + gProperty);
	}

	public void gAppearance() {
		System.out.println("Grand Father Hair Color: " + gHairColor);
	}
}
