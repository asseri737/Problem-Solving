package CodeForces;

/*Allen has a LOT of money. He has n dollars in the bank. For security reasons, he wants to withdraw it in cash (we will not disclose the reasons here). The denominations for dollar bills are 1, 5, 10, 20, 100. What is the minimum number of bills Allen could receive after withdrawing his entire balance?

Input
The first and only line of input contains a single integer n (1≤n≤109).

Output
Output the minimum number of bills that Allen could receive.*/
import java.util.Scanner;
public class Hit {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int max=105;
		int ans = 0;
		ans +=n/100; n= n%100;
		ans +=n/20; n= n%20;
		ans +=n/10; n= n%10;
		ans +=n/5; n= n%5;
		ans +=n/1; n= n%1;
		ans +=n;
		System.out.println(ans);
 
 
	
	}}