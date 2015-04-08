package classes;

public class Responder {
	
	private ResponseList responseList;
	
	public Responder(){
		responseList = new ResponseList();
		this.fillResponseList();
	}
	
	private void fillResponseList(){
		
		responseList.put("bye", "Auf Wiedersehen!");
		responseList.put("computer", "Oh Gott, von Computer habe ich keine Ahnung, ich ruf mal jemanden der sich damit auskennt.");
		responseList.put("vorgesetzten", "Also mein Chef ist mal wieder im Urlaub, da müssen sie wohl mit mir vorlieb nehmen.");
		responseList.put("mensch", "Natürlich bin ich ein Mensch. Was denken Sie denn?");
		responseList.put("hallo", "Hallo, wie geht es Ihnen? Wie kann ich ihnen helfen?");

	}
	
	public void responds(String msg){
		
		String answer = responseList.get(msg);
		
		if(answer != null){
			System.out.println(answer);
		}else{
			System.out.println("Tut mir Leid, dass verstehe ich nicht?");
		}

	}

}
