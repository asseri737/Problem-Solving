/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForces;

import java.util.*;
public class Bit {
 
  
 
	public static void main (String[] args) throws java.lang.Exception
	{
            Scanner s=new Scanner(System.in);
	int x=0;
		int f=s.nextInt();
		String b;
		for(int i=0;i<f;i++){
			b=s.next();
			if(b.charAt(0)=='+'){
				x++;
			}
				else if(b.charAt(2)=='+'){
					x++;
				}
                                else{
                                    x--;
                                }
		}
		System.out.println(x);
	}    
}
