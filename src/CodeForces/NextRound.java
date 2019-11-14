/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForces;
import java.util.*;
 public class NextRound 
 {
    public static void main(String args[])
    {
       
        int[] scores = new int[50];
        int n,K, counter=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        K = sc.nextInt();
        K = K -1 ; // array starting with 0
 
        for(int i=0 ;i< n; i++)
        {
            scores[i] = sc.nextInt();
        }
        if(scores[K] > 0)
        {
            for(int i = K+1 ;i < n && scores[K]==scores[i]; i++)
            {
                counter++;
            }
            System.out.println(counter+K+1);
        }
        else
        {
            for(int i= 0 ; i < K && scores[i] > 0; i++)
            {
                counter++;
            }
            System.out.println(counter);
        }
        
    }
}
