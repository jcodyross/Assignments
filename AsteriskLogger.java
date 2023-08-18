package Week5Assignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String error) {
		System.out.println("****************");
		System.out.println("***" + "ERROR: " + error + "***");
		System.out.println("****************");
		
	}

}
