package classes;

import java.util.Scanner;

public class InputReader {

	Scanner scanner = new Scanner(System.in); 
	
	public InputReader(){
		System.out.println("Herzlich Willkommen. Was ist Ihr Problem?"); 
	}
	
	public String getMSG(){
		System.out.println("> "); 
		return scanner.nextLine();
	}
	
}
