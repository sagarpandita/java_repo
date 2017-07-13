import java.util.Scanner;

public class class_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner num_val = new Scanner(System.in);
		calc_add(num_val.nextInt());
		num_val.close();
	}
	
	public static void calc_add (int x) {
		//String chain="";
		String tex="abcd";
		tex.toLowerCase();
		if (tex.charAt(0)=='a'){
			
		}
		for (int i=1;i<=x;i++) {
			int a,b,c;
			if (i%2==0){
				a=0;
				b=1;
			}
			else {
				a=1;
				b=0;
			}
			for (int j=1;j<=i;j++) {
				//chain=chain+x+",";	
				//System.out.println("chain" + chain);
				System.out.print(a + " ");
				c=b;b=a;a=c;
			}
			
			System.out.println();
		}
		
		//System.out.println("Numbers " + chain.substring(0, chain.length()-1) + " are prime");
		//return chain;
	}
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  if (weekday==false && vacation==false)
		    return true;
		  else if (weekday==true && vacation==false)
		    return false;
		  else if (weekday==false && vacation==true)
		    return true;
		  else
		    return false;
		}

	public int countHi(String str) {
		  int count=0;
		  for (int i=0;i<str.length();i++){
		    if ((str.charAt(i)=='H' || str.charAt(i)=='h') && (str.charAt(i+1)=='I' || str.charAt(i+1)=='i'))
		      count=count+1;
		  }
		  
		  //int[] nums={1,2,3,4};
		  //int num_rev=nums.length;
		  
		  return count;
		  
		}

}


