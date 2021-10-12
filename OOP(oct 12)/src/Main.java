import pets.Crocodile;
import pets.Eel;
import pets.Eagle;

public class Main {
	
	public static void main(String[] args) {
		Crocodile crocodile = new Crocodile(100, 100, "Reptile", "A", null, null, null);
		System.out.println(crocodile.showInfo());
		
		Eel eel = new Eel(10, 10, "fish", "B", null, null);
		System.out.println(eel.showInfo());
		
		Eagle eagle = new Eagle(20, 20, "bird", "O", null, null);
		System.out.println(eagle.showInfo());
	}

}
