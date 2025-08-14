public interface VisualRecon {

	//	INTERFACE CONSTANTS
	String SENSOR_TYPE = "High-Resolution Optical Camera";
	String STANDARD_LENS_TYPE = "50mm Standard Lens";

	//	LIST: TO BE IMPLEMENTED
	void takePicture();

	//	DEFAULT METHODS
	default void record4kVideo() {
		System.out.println("Recording 4K video using default settings.");
	}

	//	GETTERS
	static String getStandardLensType() { //	== VisualRecon.STANDARD_LENS_TYPE
		return STANDARD_LENS_TYPE;
	}

}
