package pets;

import animals.Reptile;

public class Crocodile extends Reptile{
	
	public Crocodile(int height, int weight, String animalType,String bloodType, String skin, String sequel, String eggs) {
		super(height, weight, animalType,bloodType, skin, sequel, eggs);
		
		this.eggs  = "Hard-shelled-eggs";
	}
	
	public String showInfo() {
		return "Crocodile [getHeight()=" + getHeight() + " getWeight()=" + getWeight() + " getAnimalType()=" + getAnimalType() + " getBloodType()=" + getBloodType() + " getSkin()=" + getSkin() + " getSequel()=" + getSequel() + " getEggs()=" + getEggs() + "]";   
	}

}
