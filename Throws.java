import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Throws {
	
	public static void main(String[] args) throws IOException {
		
		String file = "test.dat";
		
			Scanner input = new Scanner(new File(file));
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}//end while
			
			input.close();
		
	}//end main
}//end class