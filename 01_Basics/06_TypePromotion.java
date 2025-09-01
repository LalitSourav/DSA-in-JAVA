/*
    1.JAVA automatically promotes each byte,short,or char to int for an expression
    2.If one opertator is long , float , or double the whole expression is promoted to long , float ,or double
        ex: a+b*c/e : will come as a long (as long sabuthu bada datatype eei sabu bhitaru !)
            a:int
            b:float
            c:char
            e:long

    */
import java.util.*;

public class TypePromotion {
    public static void main(String args[]){
        char a='a';
        char b='b';
        System.out.println(b-a);//should come 1 98-97 =1
        System.out.println(a);//will come a as type promotion is possible for expression only

        // EXAMPLE
        // byte b=5;
        // byte a=b*2; WRONG
        //as b*2 is an expresion so it s converted into int and a is a byte
        //RIGHT
        //byte a = (byte)(b*2); type casting from int to byte
    }
}