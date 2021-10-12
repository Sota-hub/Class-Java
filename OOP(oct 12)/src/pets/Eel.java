package pets;

import animals.Fish;

public class Eel extends Fish{
	
	private String special;
	
	public Eel(int height, int weight, String animalType,String bloodType, String eco, String gills) {
		super(height, weight, animalType,bloodType, eco, gills);
		this.special = "Release electric charge";
	}
	
	public String getSpecial() {
		return special;
	}
	
	public String showInfo() {
		return "Eel [getHeight()=" + getHeight() + " getWeight()=" + getWeight() + " getAnimalType()=" + getAnimalType() + " getBloodType()=" + getBloodType() + " getEco()=" + getEco() + " getGills()=" + getGills() + " getSpecial()=" + getSpecial() + "]";   
	}

}