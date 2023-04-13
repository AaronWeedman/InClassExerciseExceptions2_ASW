import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TryCatch {
	
	public static void main(String[] args) {
		
		String file = "test.dat";
		
		
		try {
			Scanner input = new Scanner(new File(file));
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}//end while
			
			input.close();
		}//end try
		catch (IOException e) {
			System.out.println("Failed to read file: " + e.getMessage());
		}//end catch
		
	}//end main
}//end class