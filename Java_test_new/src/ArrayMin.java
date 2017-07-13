//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class ArrayMin {

    static int twinArrays(int[] ar1, int[] ar2){
        // Complete this function
        int min=ar1[0];
        int pos=0;
        int [] min1= new int[2];
        int [] pos1= new int[2];
        int [] pos2= new int[2];
        int [] min2= new int[2];
        int x=0,y=0;
        while (x<2){
            for (int i=1;i<ar1.length;i++){
                if (ar1[i]<min && i!=pos)
                    min=ar1[i];
                    pos=i;
            }
            min1[x]=min;
            pos1[x]=pos;
        }
        
        min=ar2[0];
        pos=0;
        while (y<2){
            for (int j=0;j<ar2.length;j++){
                    if (ar2[j]<min && j!=pos){
                        min=ar1[j];
                        pos=j;
                    }
            }
            min2[y]=min;
            pos2[y]=pos;
        }
        for (int i=0;i<2;i++){
            System.out.println(min1[i]+","+min2[i]);
            
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of values:");
        int n = in.nextInt();
        in.close();
        int[] ar1 = new int[n];
        System.out.println("Enter list 1:");
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        System.out.println("Enter list 2:");
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        System.out.println("Executing Script:");
        int result = twinArrays(ar1, ar2);
        System.out.println(result);
    }
}