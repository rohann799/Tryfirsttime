package demos2;

public class CovidApp {

	private String name;
	private int mobileNumber;
	public int choice;
	
	public CovidApp() {
		System.out.println("Covid Resources Help");
		System.out.println("1.Groceries\n2.Fruits\n3.Milk\n4.Ambulance\n5.Bed availability\n6.Doctor assistance");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int Number) {
		mobileNumber = Number;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int c) {
		choice = c;
	}
	
	
}
