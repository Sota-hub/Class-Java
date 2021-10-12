package animals;

import parent.Animal;

public class Reptile extends Animal{
	
	private String skin;
	private String sequel;
	protected String eggs;
	
	public Reptile(int height, int weight, String animalType, String bloodType, String skin, String sequel, String eggs) { 
		super(height, weight, animalType, bloodType);
		this.skin = "Dry skin";
		this.sequel = "Backbone";
		this.eggs = "Soft-shelled-eggs";
	}
	
	public String getSkin() {
		return skin;
	}
	
	public String getSequel() {
		return sequel;
	}
	
	public String getEggs() {
		return eggs;
	}

}
