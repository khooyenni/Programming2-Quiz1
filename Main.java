
public class Main {

	public static void main(String[] args) {
		
		BreakfastMaker sokany = new BreakfastMaker();
		BreakfastMaker cukyi = new BreakfastMaker();
		
		
		System.out.println("*****Sokany*****");
		sokany.setBrand();
		sokany.setModel();
		sokany.setColour();
		sokany.setVoltage();
		sokany.setOvenCapacity();
		sokany.setPrice();
		
		System.out.println("Brand           : " + sokany.getBrand());
		System.out.println("Model           : " + sokany.getModel());
		System.out.println("Colour          : " + sokany.getColour());
		System.out.println("Volatge         : " + sokany.getVoltage() + "V");
		System.out.println("Oven Capacity   : " + sokany.getOvenCapacity() + "L" );
		System.out.println("Price           : " + "RM" + sokany.getPrice());
		
		System.out.println("*****Cukyi*****");
		cukyi.setBrand();
		cukyi.setModel();
		cukyi.setColour();
		cukyi.setVoltage();
		cukyi.setOvenCapacity();
		cukyi.setPrice();
		
		System.out.println("Brand           : " + cukyi.getBrand());
		System.out.println("Model           : " + cukyi.getModel());
		System.out.println("Colour          : " + cukyi.getColour());
		System.out.println("Volatge         : " + cukyi.getVoltage() + "V");
		System.out.println("Oven Capacity   : " + cukyi.getOvenCapacity() + "L" );
		System.out.println("Price           : " + "RM" + cukyi.getPrice());

	}

}
