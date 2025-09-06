//outer loop : No. of lines
//innner loop: No. of times the char is printed
/*
------------Pattern 1------------
*
**
***
****
*****

-----------Pattern 2---------------
*****
****
***
**
*

------------Pattern 3------------
1
12
123
1234
12345

------------Pattern 4------------
A
BC
DEF
GHIJ
KLMNO

 */

import java.util.*;
public class Basic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        pattern4(n);
    }
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
         }
    }
    public static void pattern2(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
               
            }
            System.out.print("\n");
         }
    }
     public static void pattern3(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
               
            }
            System.out.print("\n");
         }
    }
    public static void pattern4(int n){
        char ch='A';
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
               
            }
            System.out.print("\n");
         }
    }

}