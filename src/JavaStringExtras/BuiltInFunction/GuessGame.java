package BuiltInFunction;
import java.util.*;
public class GuessGame {
        static int guess(int l, int h){ return (l + h) / 2; }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int low = 1, high = 100;
            while (true) {
                int g = guess(low, high);
                System.out.println("Guess: " + g + " (high/low/correct)");
                String s = sc.next();
                if (s.equals("correct")) break;
                if (s.equals("high")) high = g - 1;
                else low = g + 1;
            }
        }
}
