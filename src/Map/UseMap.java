package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		
		//hash map only print but don't print in order as data was inserted 
		
		//Map<String,String> map = new HashMap<String,String>();
		
		//if you want to print in order as data was inserted
		
		Map<String,String> map2 = new LinkedHashMap<String,String>();
		
		//adding data to the Map as (key,value)
		map2.put("Usa", "New York");
		map2.put("Canada", "Torento");
		map2.put("Bangladesh", "Dhaka");
		map2.put("Japan", "Tokyo");
		
		//To print only one entry
		
		System.out.println(map2.get("Canada"));
		
		//to print all data in one go
		
		for(Map.Entry< String,String > entry:map2.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
		
		
		
		
		
		
		
		
	}
	
}
