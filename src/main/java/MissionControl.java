public class MissionControl {

	//	MAIN PROGRAM
	public static void main(String[] args) {
		System.out.println("--- Deploying QuadCopter Unit ---");
		QuadCopter bravo_1 = new QuadCopter("Bravo-1");

		//	Invoke [Drone] Abstract Class Methods
		bravo_1.takeOff();
		bravo_1.fly();

		System.out.println("\n--- Engaging Recon Capabilities ---");

		bravo_1.takePicture();		//	VisualRecon implemented method in QuadCopter
		bravo_1.record4kVideo();	//	VisualRecon default method

		System.out.println("Standard Lens Type: " + VisualRecon.getStandardLensType());

		//	Invoke [Drone] Abstract Class Methods
		bravo_1.land();

		System.out.println("\n\n --- Deploying Advanced Fixed-Wing Unit ---");
		FixedWingDrone phoenix_7 = new FixedWingDrone("Phoenix-7");
		phoenix_7.takeOff();
		phoenix_7.fly();
		phoenix_7.takePicture();
		phoenix_7.interceptSignal();
		phoenix_7.record4kVideo();
		phoenix_7.land();
	}

}
