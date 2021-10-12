package animals;

import parent.Animal;

public class Fish extends Animal{
	
	private String eco;
	private String gills;
	
	public Fish(int height, int weight, String animalType, String bloodType, String eco, String gills) { 
		super(height, weight, animalType,bloodType);
		this.eco = "Live in water";
		this.gills = "Has gills";
	}
	
	public String getEco() {
		return eco;
	}
	
	public String getGills() {
		return gills;
	}
}
