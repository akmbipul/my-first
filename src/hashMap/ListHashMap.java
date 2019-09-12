package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListHashMap {

	public static void main(String[] args) {
		
		List<String> stateOfUsa = new ArrayList<String>();
		
		stateOfUsa.add("NY");
		stateOfUsa.add("NJ");
		stateOfUsa.add("FL");
		stateOfUsa.add("AZ");
		stateOfUsa.add("VA");
		
		List<String> stateOfCanada = new ArrayList<String>();
		
		stateOfCanada.add("TORENTO");
		stateOfCanada.add("MONTREAL");
		stateOfCanada.add("ALBARTA");
		stateOfCanada.add("VANCOUVER");
		
		List<String> stateOfBangladesh = new ArrayList<String>();
		
		stateOfBangladesh.add("DHAKA");
		stateOfBangladesh.add("COMILLA");
		stateOfBangladesh.add("CHITTAGONJ");
		stateOfBangladesh.add("SYLHET");
		stateOfBangladesh.add("MANIKGONJ");
		
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		map.put("USA", stateOfUsa);
		map.put("CANADA", stateOfCanada);
		map.put("BANGLADESH", stateOfBangladesh);
		
		for(Map.Entry<String, List<String>> entry: map.entrySet()) {
		
		   System.out.println(entry.getKey()+" "+entry.getValue());	
		}
		
		
	}
}
