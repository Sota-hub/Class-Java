package lab;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListMain {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		Random random = new Random();
			for(int i = 0; i < 10; i++) {
				int randomInt = random.nextInt(50);
				arrayList.add(randomInt);
			}
		System.out.println(arrayList);
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an iteger");
		
		String userInput = scan.nextLine();
		int userNumber = Integer.parseInt(userInput);
		
		boolean inList = arrayList.contains(userNumber);
		if (inList)
            System.out.println("The number is in the list");
        else
            System.out.println("The number isn't in the list");
	}

}
