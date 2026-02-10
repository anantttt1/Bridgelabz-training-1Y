package JavaStringExtras.PracticeProblemsExtra;
public class LongestWord {
        public static void main(String[] args) {
            String s = "Java is very powerful language";
            String[] words = s.split(" ");
            String longest = words[0];

            for (String w : words) {
                if (w.length() > longest.length())
                    longest = w;
            }
            System.out.println(longest);
        }
    }


