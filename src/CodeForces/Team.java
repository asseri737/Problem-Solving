/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForces;
import java.util.Scanner;
 public class Team 
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