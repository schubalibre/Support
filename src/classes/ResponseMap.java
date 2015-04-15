package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interfaces.ResponseMapInterface;

public class ResponseMap implements ResponseMapInterface {

	private Map<String, String> responseMap = new HashMap<String, String>();
	
	@Override
	public String get(String key) {
		return responseMap.get(key);
	}

	@Override
	public void put(String key, String msg) {
		responseMap.put(key, msg);
	}

	@Override
	public boolean contains(String key) {
		return responseMap.containsKey(key);
	}

	@Override
	public List<String> allKeys() {
		// wird automatisch gecastet
		return new ArrayList<String>(responseMap.keySet());
	}

	@Override
	public int size() {
		return responseMap.size();
	}

}
