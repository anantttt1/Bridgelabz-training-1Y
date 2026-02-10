package BuiltInFunction;
import java.util.*;
public class Pallindrome {
        static boolean check(String s){
            return s.equals(new StringBuilder(s).reverse().toString());
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println(check(sc.next()));
        }
    }


