package Week5Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i) + " ");	
		}
		System.out.println();
	}

	@Override
	public void error(String error) {
		System.out.print("ERROR: ");
		for (int i = 0; i < error.length(); i++) {
            System.out.print(error.charAt(i) + " ");
        }
        System.out.println();
    }
}