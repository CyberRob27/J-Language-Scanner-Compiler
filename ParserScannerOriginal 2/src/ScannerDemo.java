/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\Kito\\eclipse-workspace\\ParserScannerOriginal\\bin\\prog1.jay";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			// If the type is of other then it will be omitted as it is a lexical error
			Token t = ts.nextToken();
			if(!(t.getType().equals("Other"))) {
				System.out.println(t);
			}
			
		}
	}
}
