package classes;

public class SupportSystem {
	
	public static void main(String[] args) {
		
		InputReader input = new InputReader();
		Responder responder = new Responder();
		
		while(true){
			System.out.println(responder.generateResponse(input.getMSG()));
		}
		
	}
}
