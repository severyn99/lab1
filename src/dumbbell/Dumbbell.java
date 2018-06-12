package dumbbell;

public final class Dumbbell {

	
	private String type;
	private String colour;
    private int quantity;
    private double price;
    private double weight;
    
    private static double GeneralWeight = 0.0;
    
	public String getType() {
		return type;
	}
	public void setType(String Type) {
		this.type = Type;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String Colour) {
		this.colour = Colour;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int Quantity) {
		this.quantity = Quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double Price) {
		this.price = Price;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double Weight) {
	        GeneralWeight = GeneralWeight - this.weight + Weight;
		this.weight=Weight;
	}
	
	private Dumbbell() {
		type = "Small dumbbell";
		colour = "Pink";
		quantity = 1;
		price = 30.5;
		weight = 2.5;
		GeneralWeight += (weight*quantity);
	}
	
	public Dumbbell(String Type, String Colour, int Quantity, double Price){
		setType(Type);
		setColour(Colour);
		setQuantity(Quantity);
		setPrice(Price);
		weight = 5.0;
		GeneralWeight += (weight*Quantity);
	}
	
	public Dumbbell(String Type, String Colour, int Quantity, double Price, double Weight){
		setType(Type);
		setColour(Colour);
		setQuantity(Quantity);
		setPrice(Price);
		setWeight(Weight);
	}
	
        @Override
     	public String toString() {
		return getColour() + " " + getType() + " in the quantity of " + getQuantity() + " weighs " + getWeight() + " kg and costs " + getPrice() + " hrn." ;
        }
	
	public static void printStaticSum() {
		System.out.println("Total dumbbells weight is " + GeneralWeight + " kg.");
	}
	
	public void printSum() {
		System.out.println("Total weight of this " + type + "s is " + weight + " kg.");
	}
	
	public void resetValues(String Type, String Colour, int Quantity, double Price, double Weight) {
		setType(Type);
		setColour(Colour);
		setQuantity(Quantity);
		setPrice(Price);
		setWeight(Weight);
	}

	public static void main(String[] args) {
		Dumbbell smallDumbbell = new Dumbbell();
		Dumbbell middleDumbbell = new Dumbbell("Middle dumbbell", "Black", 6, 300.0);
		Dumbbell bigDumbbell = new Dumbbell("Big dumbbell", "Blue", 10, 55.0, 100.0);
		
		System.out.println(smallDumbbell.toString());
		System.out.println(middleDumbbell.toString());
		System.out.println(bigDumbbell.toString());
		
		Dumbbell.printStaticSum();
		
		smallDumbbell.printSum();
		middleDumbbell.printSum();
		bigDumbbell.printSum();
	}
}