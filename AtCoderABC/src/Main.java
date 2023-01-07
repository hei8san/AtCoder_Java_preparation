import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			String s = sc.next();
			BigInteger bigNum = new BigInteger(s);
//			System.out.println(bigNum.toString());
			BigInteger limit = bigNum.sqrt();
			long limitL = limit.longValue();
			long lnum = bigNum.longValue();
			long p = 0;
			long q = 0;
			Set<Long> set = new HashSet<>();
			for (long k = 2; k <= limitL; k++) {

				if (lnum % k == 0) {

					lnum /= k;

					if (lnum == 1) {
//						System.out.print(k);
					}

					else {
						if(set.add(k)) {
							p = k;
							break;
						}
					}

					k = 1;

				}
			}
			
			for (long k = p; k <= limitL; k++) {

				if (lnum % k == 0) {

					lnum /= k;

					if (lnum == 1) {
//						System.out.print(k);
					}

					else {
						if(set.add(k)) break;
					}

					k = 1;

				}
			}
			for (Long e : set) {
				System.out.print(e + " ");
			}
			System.out.println();

		}

	}

}
