package inheritance.animals;

public class Dog extends Animal {
	String barkVoice;

	public String bark(String barkVoice) {
		this.barkVoice = barkVoice;
		return barkVoice;
	}

}
