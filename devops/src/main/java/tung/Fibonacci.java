package tung; 
 
public class Fibonacci {
   public void fibonacci() {
     int n=15, a=1, b=1;
     System.out.print("Shfaqja e 15 numrave te pare nga vargu i Fibonacci: ");
     System.out.print(a + " " + b);
     for(int i=3; i<n; i++)
     {
	b = a + b;
	a = b - a;
	System.out.print(" " + b);
     }
   }
} 
