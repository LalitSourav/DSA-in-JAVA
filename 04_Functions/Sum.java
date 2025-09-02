import java.util.*;
public class Sum {

    public static void calSum(int n1,int n2){//Parameters/Formal Params{
        int sum=n1+n2;
        System.out.println("Sum = "+sum);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        calSum(n1,n2);//Arguments/Actual Param
    }
}
