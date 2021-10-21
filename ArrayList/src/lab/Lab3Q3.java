package lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab3Q3 {
public static void main(String[] args){
	ArrayList <Car>list = new ArrayList<Car>();
    list.add(new Car("Toyota", "C-HR", 1937));
    list.add(new Car("Ford", "F-150", 1903));
    list.add(new Car("BMW", "X5", 1916));

    Collections.sort(list);
    for (Car carNumber: list) {
        System.out.print("[Car Year = " + carNumber.year());
        System.out.println(", Make = " + carNumber.make());
        System.out.println(", Model = " + carNumber.model());
    }
}
	
	
	
        
    }



class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int year;
    public Car(String make,String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
  
	public int year() {
        return this.year;
    }
    public String make() {
        return this.make;
    }
    public String model() {
        return this.model;
    }
    public int compareTo( Car car ){
        return this.year() - car.year();
    }

} 
