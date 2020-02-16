/*
 You have n candies. You want to give as much to your friends as possible, but you have a problem; every time you give two friends a candy each, you can't help but eat one yourself (if you have one left). You tried to resist after giving the first one, but after giving the second, it was unbearable.

What is the maximum number of friends you can give candies to?

Input
The first line of input contains n (1 ≤ n ≤ 109), the number of candies you have.

Output
Output a single line with the maximum number of friends you can give candies to.
 */
package CodeForces;
import java.util.*;
public class Generous {
public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	int n=ss.nextInt(); 
	n=(n/3)*2+(n%3);
	System.out.println(n);
}
}