import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class MAPTesting extends Thread {

	public static void main(String[] args) {
		//ConcurrentHashMap map = new ConcurrentHashMap();
		/*map.put(101, "Naman");
		//map.remove(101, "Naman");
		System.out.println(map);
		
		map.replace(101, "Naman", "Deepak");
		System.out.println(map);*/
		
		/*map.put(101, "A");
		map.put(102, "B");
		map.putIfAbsent(103, "c");
		map.putIfAbsent(101, "D");
		map.remove(101,"D");
		map.replace(102, "B", "E");
		map.putIfAbsent(103, "EE");
		
		System.out.println(map);*/
		
		//char l ='\1001';
		
		char A ='\u0005';
		if (A==0x0005) {
			System.out.println("eq");
		}
		else{
			System.out.println("nq");
		}
		
		MAPTesting t = new MAPTesting();
		t.start();
		t.start();
		
	}
	
	

}
