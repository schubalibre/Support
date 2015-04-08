package classes;

import java.util.ArrayList;
import java.util.List;

import exception.DuplicateKeyException;
import interfaces.ResponseMapInterface;

public class ResponseList implements ResponseMapInterface {
	
	private ArrayList<MapElement> responseList = new ArrayList<MapElement>();

	@Override
	public String get(String key) {
		String answer = null;
		
		for(MapElement mapElement : responseList){
			if(key.trim().toLowerCase().contains(mapElement.getKey())){
				answer = mapElement.getValue();
			}
		}
		return answer;
	}

	@Override
	public void put(String key, String msg) throws DuplicateKeyException {
		
		if(this.contains(key)) throw new DuplicateKeyException();
	
		responseList.add(new MapElement(key, msg));
	}

	@Override
	public boolean contains(String key) {
		
		if(this.size() == 0) return false;
		
		for(MapElement mapElement : responseList){
			if(mapElement.getKey().equals(key)){
				return true;
			}
		}
		return false;
	}

	@Override
	public List<String> allKeys() {
		
		List<String> keys = new ArrayList<String>();
		
		for(MapElement mapElement : responseList){
			keys.add(mapElement.getKey());
		}
		return keys;
	}

	@Override
	public int size() {

		return responseList.size();
	}

}
