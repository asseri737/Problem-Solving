/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForces;
import java.util.Scanner;
 public class WayTooLong 
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
 	double length = ss.nextInt();
		String in = null;
		
		for(int i = 0; i <= length; i++)
		{
			in = ss.nextLine();
			
			if(in.length() > 10)
			{
				System.out.print(in.charAt(0));
				System.out.print(in.length() -2); 
				System.out.println(in.charAt(in.length() -1));
			}else
				System.out.println(in);
			
		} 
    }
}