import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem2{
	
	public static void main(String[] args) {
		
		TreeSet<String> wordSet = new TreeSet<>();			//Initialize a TreeSet to be filled with the words in the text file
		String filePath;									//(TreeSet supports ordering, so words will be eventually printed out in ascending order)
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file path to the text file you wish to be read: ");		//Reads an input (file path to the text file) from the user
		filePath = input.next();
		
		Scanner scanner2 = null;
		
		try {
			scanner2 = new Scanner(new File(filePath));			//try-catch block here to make sure the file exists already
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (scanner2.hasNextLine()) {
			
			Scanner scanner3 = new Scanner(scanner2.nextLine());		//Nested while loop reads words from the file and adds them to wordSet
			
			while (scanner3.hasNext()) {
				
				String nextWord = scanner3.next();
				wordSet.add(nextWord);
			}
		}
		System.out.println("\nWords in text file printed in ascending order:\n");
		for (String element : wordSet) {
			
			System.out.println(element);								//Printing from wordSet will automatically print in ascending order
		}
		
	}
}