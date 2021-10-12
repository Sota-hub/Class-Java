package animals;

import parent.Animal;

public class Birds extends Animal{

	private String feathers;
	private String fly;
	
	public Birds(int height, int weight, String animalType,String bloodType, String feathers, String fly) { 
		super(height, weight, animalType, bloodType);
		this.feathers= "Animal with feathers";
		this.fly = "Can fly";
	}
	
	public String getFeathers() {
		return feathers;
	}
	
	public String getFly() {
		return fly;
	}
}
