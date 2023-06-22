import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class C_Good_Sequence {
	
	static Scanner in = new Scanner(System.in);
	
	static int n;
	
	static long a[];
	
	static void solve() {
		
		Map<Long, Integer> map = new HashMap<>();
		
		for(long i : a) {
			
			map.put(i, map.getOrDefault(i, 0) + 1);
			
		}
		
		long operations = 0L;
		
		for(long i : map.keySet()) {
			
			if(i == map.get(i)) {
				
				continue;
				
			}
			
			if((long)map.get(i) < i) {
				
				operations += map.get(i);
				continue;
				
			}
			
			operations += Math.abs(map.get(i) - i);
			
		}
		
		System.out.println(operations);
		
	}
	
	public static void main(String [] priya) {
		
		input();
		solve();
		
	}
	
	private static void input() {
		
		n = in.nextInt();
		
		a = new long[n];
		
		for(int i = 0; i < n; ++i) {
			
			a[i] = in.nextLong();
			
		}
		
	}
	
}