package CodeForces;
import java.util.Scanner;
 public class StonesOnTable 
{public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
                String B=sc.next();
              int  count=0;
                char count2=B.charAt(0);
                
                
                for(int i=1;i<a;i++){
                   if(B.charAt(i)==count2)count++;
                       
                   
                   else
                       count2=B.charAt(i);
                   
                }
                
                
                System.out.println(count);
        }	
}