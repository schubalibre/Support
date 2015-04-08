package classes;

import java.util.ArrayList;
import java.util.Random;

public class Responder {
	
	private ResponseMap responseMap;
	private Random randomGenerator = new Random();
	private ArrayList<String> defaultList;
	
	public Responder(){
		responseMap = new ResponseMap();
		this.fillResponseList();
		defaultList = new ArrayList<String>();
		this.fillDefaultList();
	}
	
	private void fillResponseList(){
		
		responseMap.put("bye", "Auf Wiedersehen!");
		responseMap.put("computer", "Oh Gott, von Computer habe ich keine Ahnung, ich ruf mal jemanden der sich damit auskennt.");
		responseMap.put("vorgesetzten", "Also mein Chef ist mal wieder im Urlaub, da müssen sie wohl mit mir vorlieb nehmen.");
		responseMap.put("mensch", "Natürlich bin ich ein Mensch. Was denken Sie denn?");
		responseMap.put("hallo", "Hallo, wie geht es Ihnen? Wie kann ich ihnen helfen?");

	}
	
	private void fillDefaultList(){
		
		defaultList.add("Ok. Ich verstehe!");
		defaultList.add("Sie sollten Ihre Version aktualisieren");
		defaultList.add("Kaufen Sie doch unsere Pro-Version, damit geht es leichter.");
		defaultList.add("Tut mir Leid, dass verstehe ich nicht.");
		defaultList.add("Einfach mal den Stecker ziehen und den Staub wegblasen. Das hilft manchmal.");

	}
	
	public String generateResponse(String keyword){
		String answer = responseMap.get(keyword);
		if(answer != null) return answer;
		return pickDefaulteResponse();
	}
	
	private String pickDefaulteResponse(){
		int nextIndex = randomGenerator.nextInt(defaultList.size());
		return defaultList.get(nextIndex);
	}

}
