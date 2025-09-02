import java.util.*;
public class BinToDec{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Binary Number :");
        int num=sc.nextInt();
        convert(num);
    }
    public static void convert(int num){
        int pow=0;
        int dec=0;
        while(num!=0){
            int ld=num%10;
            num=num/10;
            dec = dec + (ld * (int)Math.pow(2,pow));//Math.pow takes double value and also returns double so type casting is done to make it integer
            pow++;
        }
        System.out.println("Decimal Value: "+dec);
    }
} 