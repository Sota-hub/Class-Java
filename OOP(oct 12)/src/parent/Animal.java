package parent;

public class Animal {
	
	private int height;
	private int weight;
	private String animalType;
	private String bloodType;
	
	public Animal(int height, int weight, String animalType,String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getAnimalType() {
		return animalType;
	}
	
	public void setAnimal_type(String animal_type) {
		this.animalType = animal_type;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	

	public void setBlood_type(String blood_type) {
		this.bloodType = blood_type;
	}
	
}
