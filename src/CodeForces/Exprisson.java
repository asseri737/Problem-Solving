/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForces;
import java.util.Scanner;
 public class Exprisson 
{public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int a,b,c;
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                //int res;
                int res1=(a+b)*c;
                int res2=a+(b*c);
                int res3=a*b*c;
                int res4=a+b+c;
                int res5=(a*b)+c;
                int res6=a*(b+c);
		int max = Math.max(Math.max(Math.max(res1, res2), Math.max(res3, res4)), Math.max(res5, res6));
                System.out.println(max);
        }	
}
