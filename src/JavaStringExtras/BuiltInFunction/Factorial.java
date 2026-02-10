package BuiltInFunction;
import java.util.*;
public class Factorial {
        static int fact(int n){
            return (n==0)?1:n*fact(n-1);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println(fact(sc.nextInt()));
        }
    }


