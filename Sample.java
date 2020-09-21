import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Hashmap {

	public static void main(String args[]){

		Hashmap<Integer,String> hashmap = new Hashmap<Integer,String>();
		hashmap.put(4,"Ramesh");
		hashmap.put(2, "Suresh");
		hashmap.put(3, "Rajesh");		
		hashmap.put(1, "Rajan");

//		for(Map.Entry m : hashmap.entrySet()){
//			System.out.println(m.getKey() + " "+m.getValue());
//		}

		TreeMap<Integer,String> treemap = new TreeMap<Integer,String>(hashmap);
		
		for(Map.Entry<Integer,String> map : treemap.entrySet()){
			System.out.println(map.getKey() + " "+map.getValue());
		}
 	}

}
