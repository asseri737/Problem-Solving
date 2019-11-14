package CodeForces;
import java.util.Scanner;
 public class Football 
{
   public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int mm = sc.nextInt();
		int count = 0;
 
		for (int i = 0; i < mm; i++) {
			int KK = sc.nextInt() + sc.nextInt() + sc.nextInt();
			if (KK >= 2)
				count++;
		}
 
		System.out.println(count);
	}
}