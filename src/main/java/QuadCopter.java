public class QuadCopter extends Drone implements VisualRecon{

	//	CONSTRUCTORS
	public QuadCopter(String callSign) {
		super(callSign);
	}

	@Override	//	: Drone (Class)
	public void fly() {
		System.out.println(getCallSign() + " is hovering with four rotors.");
	}

	@Override	//	: VisualRecon (Interface)
	public void takePicture() {
		System.out.println(getCallSign() + " takes a picture with its " + SENSOR_TYPE);
	}

}
