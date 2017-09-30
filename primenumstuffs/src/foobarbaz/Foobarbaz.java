package foobarbaz;

public class Foobarbaz {
	//private static String tempString; IGNORE
	private static final String FOO = "foo";
	private static final String BAR = "bar";
	private static final String BAZ = "baz";
	private static int counter;
	private static boolean printedMessage = false;
	public static void foobarbazDisplay() {
		counter = 1;
		//tempString = ""; string not needed
		while(counter < 501) {
			if(counter % 3 == 0 && counter % 7 == 0 && counter % 10 == 0) {
				System.out.println(FOO + BAR + BAZ);
				 printedMessage = true;
			}
			if(counter % 3 == 0 && counter % 7 == 0) {
				System.out.println(FOO + BAR);
				printedMessage = true;
			}
			if(counter % 3 == 0 && counter % 10 == 0) {
				System.out.println(FOO + BAZ);
				printedMessage = true;
			}
			if(counter % 7 == 0 && counter % 10 == 0) {
				System.out.println(BAR + BAZ);
				printedMessage = true;
			}
			if(counter % 3 == 0) {
				System.out.println(FOO);
				printedMessage = true;
			}
			if(counter % 7 == 0) {
				System.out.println(BAR);
				printedMessage = true;
			}
			if(counter % 10 == 0) {
				System.out.println(BAZ);
				printedMessage = true;
			}
			else {
				if(!printedMessage) {
					System.out.println(counter);
				}
			}
			printedMessage = false;
			counter++;
			
		}
			
	}
	public static void main(String[] args) {
		Foobarbaz.foobarbazDisplay();
	}

}
