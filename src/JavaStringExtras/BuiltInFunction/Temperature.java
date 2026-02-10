package BuiltInFunction;
import java.util.*;
public class Temperature {
        static double fToC(double f){ return (f-32)*5/9; }
        static double cToF(double c){ return (c*9/5)+32; }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println(fToC(sc.nextDouble()));
            System.out.println(cToF(sc.nextDouble()));
        }
    }

