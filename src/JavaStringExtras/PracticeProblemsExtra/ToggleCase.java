package JavaStringExtras.PracticeProblemsExtra;
public class ToggleCase {
        public static void main(String[] args) {
            String s = "JaVa";
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    result += (char)(ch + 32);
                else
                    result += (char)(ch - 32);
            }
            System.out.println(result);
        }
    }


