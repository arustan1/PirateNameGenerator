package model;

public class NameGenerator {

	private String shirtColor;
	private String birthMonth;
	private String firstName;
	private String lastName;
	
	public NameGenerator() {
		super();
	}
	
	public NameGenerator(String shirtColor, String birthMonth) {
		super();
		this.shirtColor = shirtColor;
		this.birthMonth = birthMonth;
		generate(shirtColor, birthMonth);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getShirtColor() {
		return shirtColor;
	}

	public void setShirtColor(String shirtColor) {
		this.shirtColor = shirtColor;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public void generate(String shirtColor, String birthMonth) {
		String color = shirtColor.toLowerCase();
		String month = birthMonth.toLowerCase();
		switch(color) {
		case "red":
			setFirstName("Captain");
			break;
		case "orange":
			setFirstName("Skipper");
			break;
		case "yellow":
			setFirstName("Toothless");
			break;
		case "green":
			setFirstName("PegLeg");
			break;
		case "blue":
			setFirstName("Plunderin'");
			break;
		case "purple":
			setFirstName("Swaggerin'");
			break;
		case "black":
			setFirstName("Jolly");
			break;
		case "white":
			setFirstName("Shipwrecked");
			break;
		case "grey":
			setFirstName("Grubby");
			break;
		case "pink":
			setFirstName("Surly");
			break;
		default:
			System.out.println("I'm sorry, I don't recognize that color");
		}
		switch(month) {
		case "january":
			setLastName("Landlubber");
			break;
		case "february":
			setLastName("HookHand");
			break;
		case "march":
			setLastName("Barnacle");
			break;
		case "april":
			setLastName("Swashbuckler");
			break;
		case "may":
			setLastName("Jones");
			break;
		case "june":
			setLastName("DeadMan");
			break;
		case "july":
			setLastName("StormWatcher");
			break;
		case "august":
			setLastName("The Shipless");
			break;
		case "september":
			setLastName("The Clumsy");
			break;
		case "october":
			setLastName("The Bored");
			break;
		case "november":
			setLastName("BlackHeart");
			break;
		case "december":
			setLastName("SeaLegs");
			break;
		default:
			System.out.println("I'm sorry, I don't recognize that month");
		}
	}
		
		@Override
		public String toString() {
			return "Your pirate name is: " + firstName + lastName;
		}
	
}
