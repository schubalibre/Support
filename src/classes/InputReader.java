package classes;

import java.util.HashSet;
import java.util.Scanner;

public class InputReader {

	private Scanner scanner = new Scanner(System.in); 
	
	public InputReader(){
		System.out.println("Herzlich Willkommen. Was ist Ihr Problem?"); 
	}
	
	public HashSet<String> getMSG(){
		System.out.println("> "); 
		
		String inputLine = scanner.nextLine().trim().toLowerCase();
		
		String[] wordArray = inputLine.split(" ");
		
		HashSet<String> words = new HashSet<String>();
		for(String word : wordArray){
			words.add(word);
		}
		return words;
	}
	
}
