public abstract class Drone {

	//	INSTANCE VARIABLES
	private String callSign;

	//	CONSTRUCTORS
	public Drone(String callSign) {
		this.callSign = callSign;
	}

	//	LIST: TO BE IMPLEMENTED
	public abstract void fly();

	//	INSTANCE METHODS
	public void takeOff() {
		System.out.println(callSign + " is taking off.");
	}

	public void land() {
		System.out.println(callSign + " is landing.");
	}

	//	GETTERS
	public String getCallSign() {
		return this.callSign;
	}

}
