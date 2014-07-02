package mytest;

public class Capital {

	private static Capital instance = null;

	private Capital() {
	}

	// singletone
	public static Capital getInstance() {
		if (instance == null)
			instance = new Capital();
		return instance;
	}

	@Override
	public String toString() {
		return "Capital []";
	}
	
	

}
