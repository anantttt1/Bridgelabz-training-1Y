package BuiltInFunction;
import java.util.*;
public class MaxThree {
        static int max(int a,int b,int c){
            return Math.max(a, Math.max(b, c));
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println(max(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }

