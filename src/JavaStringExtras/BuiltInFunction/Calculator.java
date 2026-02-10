package BuiltInFunction;
import java.util.*;
public class Calculator {
        static int add(int a,int b){ return a+b; }
        static int sub(int a,int b){ return a-b; }
        static int mul(int a,int b){ return a*b; }
        static int div(int a,int b){ return a/b; }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt(), b=sc.nextInt();
            char op=sc.next().charAt(0);
            System.out.println(
                    op=='+'?add(a,b):
                            op=='-'?sub(a,b):
                                    op=='*'?mul(a,b):div(a,b)
            );
        }
    }


