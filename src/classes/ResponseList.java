package classes;

import java.util.ArrayList;
import java.util.List;

import exception.DuplicateKeyException;
import interfaces.ResponseMapInterface;

public class ResponseList implements ResponseMapInterface {
	
	private ArrayList<MapElement<String, String>> responseList = new ArrayList<MapElement<String, String>>();

	@Override
	public String get(String key) {
		String answer = null;
		
		for(MapElement<String, String> mapElement : responseList){
			if(mapElement.getKey().contains(key)){
				answer = mapElement.getValue();
			}
		}
		return answer;
	}

	@Override
	public void put(String key, String msg) throws DuplicateKeyException {
		
		if(this.contains(key)) throw new DuplicateKeyException();
	
		responseList.add(new MapElement<String, String>(key.toLowerCase().trim(), msg));
	}

	@Override
	public boolean contains(String key) {
		return this.allKeys().contains(key);
	}

	@Override
	public List<String> allKeys() {
		
		List<String> keys = new ArrayList<String>();
		
		for(MapElement<String, String> mapElement : responseList)
			keys.add(mapElement.getKey());
		
		return keys;
	}

	@Override
	public int size() {

		return responseList.size();
	}

}
