package pets;

import animals.Birds;

public class Eagle extends Birds{
	
	public Eagle(int height, int weight, String animalType,String bloodType, String feathers, String fly) {
		super (height, weight, animalType, bloodType, feathers, fly);
		
	}
	
	public String showInfo() {
		return "Eagle [getHeight()=" + getHeight() + " getWeight()=" + getWeight() + " getAnimalType()=" + getAnimalType() + " getBloodType()=" + getBloodType() + " getFeathers()=" + getFeathers() + " getFly()=" + getFly() + "]";   
	}

}
