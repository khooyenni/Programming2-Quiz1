import java.util.Scanner;

public class BreakfastMaker {
	
	String brand;
	String model;
	String colour;
	int voltage;
	int ovenCapacity;
	double price;
	
	Scanner s = new Scanner(System.in);
	  
	// Create Setter Method
	public void setBrand() {
		System.out.println("Please enter the brand of breakfast maker:");
		this.brand = s.nextLine();	
	}
	  
	public void setModel() {
		System.out.println("Please enter the model of breakfast maker:");
		this.model = s.nextLine();	
	}
	  
	public void setColour() {
		System.out.println("Please enter the colour of breakfast maker:");
		this.colour = s.nextLine();	
	}
	  
	public void setVoltage() {
		System.out.println("Please enter the voltage of breakfast maker:");
		this.voltage = s.nextInt();	
	}
	  
	public void setOvenCapacity() {
		System.out.println("Please enter the oven capacity of breakfast maker:");
		this.ovenCapacity = s.nextInt();	
	}
	  
	public void setPrice() {
		System.out.println("Please enter the price of breakfast maker:");
		this.price = s.nextDouble();	
	}

	// Create Getter Method
	  
	public String getBrand() {
		return this.brand;
	}
	  
	public String getModel() {
	    return this.model;
 	}
	  
	public String getColour() {
	 	return this.colour;
 	}
	  
	public Integer getVoltage() {
		return this.voltage;
	}
	  
	  
	public double getOvenCapacity() {
		return this.ovenCapacity;
	}
	  
	public double getPrice() {
		return this.price;
	}

}
