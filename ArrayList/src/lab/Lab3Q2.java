package lab;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		Random random = new Random();
			for(int i = 0; i < 10; i++) {
				int randomInt = random.nextInt(50);
				arrayList.add(randomInt);
			}
			
		ArrayList arrayListCopied = new ArrayList(arrayList);
		System.out.println(arrayListCopied);
		
		arrayList.set( arrayList.size() - 1 , -5);
		System.out.println(arrayList);
		
	}

}
