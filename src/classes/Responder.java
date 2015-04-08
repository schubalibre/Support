package classes;

public class Responder {
	
	private ResponseMap responseMap;
	
	public Responder(){
		responseMap = new ResponseMap();
		this.fillResponseList();
	}
	
	private void fillResponseList(){
		
		responseMap.put("bye", "Auf Wiedersehen!");
		responseMap.put("computer", "Oh Gott, von Computer habe ich keine Ahnung, ich ruf mal jemanden der sich damit auskennt.");
		responseMap.put("vorgesetzten", "Also mein Chef ist mal wieder im Urlaub, da müssen sie wohl mit mir vorlieb nehmen.");
		responseMap.put("mensch", "Natürlich bin ich ein Mensch. Was denken Sie denn?");
		responseMap.put("hallo", "Hallo, wie geht es Ihnen? Wie kann ich ihnen helfen?");

	}
	
	public void responds(String msg){
		
		String answer = responseMap.get(msg);
		
		if(answer != null){
			System.out.println(answer);
		}else{
			System.out.println("Tut mir Leid, das verstehe ich nicht?");
		}

	}

}
