//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		String ans = "Yes";
//
////		for(int s = 0; s< n; s++) {
////			numberN[s] = -1;
////		}
//		Map<int[], Integer> map = new HashMap<>();
//
//		for (int i = 0; i < m; i++) {
//			int k = sc.nextInt();
//			int[] numberN = new int[n];
//			for (int j = 0; j < k; j++) {
//				int x = sc.nextInt();
//				numberN[x - 1]++;
//			}
//			for (int s = 0; s < n - 1; s++) {
//				for (int p = s + 1; p < n; p++) {
//					int s1 = numberN[s];
//					int p1 = numberN[p];
//					if (s1 > 0 && p1 > 0) {
//						int[] pair = { s1, p1 };
//						if (map.containsKey(pair)) {
//							int v = map.get(pair);
//							v++;
//							map.put(pair, v);
//						} else {
//							map.put(pair, 1);
//						}
//
//					}
//				}
//				
//			}
//
//		}
//		
//		for(int i = 1; i <= n-1; i++) {
//			for(int j = n+1; j <= n; j++) {
//				int[] pair = { i, j };
//				for (Map.Entry<int[], Integer> entry : map.entrySet()) {
//					if(entry.getKey()[0] == i) {
//						System.out.println(Arrays.toString(pair) + ", " + entry.getValue());
//					}
//					
//					
//				}
//			}
//		}
//		// System.out.println(Arrays.toString(numberN));
//
//		System.out.println(ans);
//
//	}
//
//}
