import java.util.*;
public class DecToBin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal Number :");
        int num=sc.nextInt();
        convert(num);
    }
    public static void convert(int num){
        int bin=0;
        int pow=0;
        while(num!=0){
            int rem=num%2;
            num=num/2;
            // bin=(bin*10) + rem; WRONG
            bin= bin + (rem * (int)Math.pow(10,pow));
            pow++;
        }
       
        
        System.out.println("Binary Value: "+bin);
    }
}