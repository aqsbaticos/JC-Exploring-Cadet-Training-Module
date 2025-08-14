public class FixedWingDrone extends Drone implements AdvancedRecon{

	//	CONSTRUCTORS
	public FixedWingDrone(String callSign) {
		super(callSign);
	}

	@Override	//	Drone (Class)
	public void fly() {
		System.out.println(getCallSign() + " is cruising at high altitude;.");
	}

	@Override	//	VisualRecon (Interface)
	public void takePicture() {
		System.out.println(getCallSign() + " captures high-resolutions satellite imagery.");
	}

	@Override	//	SignalIntel (Interface)
	public void interceptSignal() {
		System.out.println(getCallSign() + " intercepts and analyzes radio frequencies.");
	}

	@Override	//	VisualRecon (Interface) Default Method
	public void record4kVideo() {
		System.out.println("Engaging gimbal-stabilized 4K video recording.");
	}

}
