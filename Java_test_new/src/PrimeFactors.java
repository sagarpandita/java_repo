import java.util.*;
//import java.math.*;

public class PrimeFactors {
	
	public static void main (String args[]){
		getPrimeFactors(5553430);
	}
	public static void getPrimeFactors(int n){
		//int primeFactorCount=1;
		//int num=n;
		ArrayList<Integer> arrFac=new ArrayList<Integer>();
		//while (n>2){
			int i;
			//System.out.println("Entering while loop");
			if (n%2==0){
				arrFac.add(2);
				while (n%2==0)
		        {
		            System.out.print(2 + " ");
		            n /= 2;
		        }
			}
			for (i=3;i<=Math.sqrt(n);i+=2){
				System.out.println("Entering for loop with n: "+n);
				if (n%i==0){
					System.out.println("Entering if loop");
					arrFac.add(i);
					System.out.println(i);
					while (n%i==0)
						n=n/i;
				}
				
			}
			
			if (n > 2)
	            arrFac.add(n);
		//}
		System.out.println(arrFac);
	}
	
	public static boolean isPrime(int x){
		int count=1;
		System.out.println(x);
		for (int i=2;i<=x/2;i++){
			if (x%i==0){
				count=count+1;
			}
		}
		System.out.println(count);
		if (count==1){
			return true;
		}
		else
			return false;
	}
	
}
