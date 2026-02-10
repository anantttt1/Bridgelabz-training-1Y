package JavaStringExtras.PracticeProblemsExtra;
public class ReplaceWord {
        public static String replaceWord(String sentence, String oldWord, String newWord) {
            String[] words = sentence.split(" ");
            String result = "";
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(oldWord)) {
                    result = result + newWord + " ";
                } else {
                    result = result + words[i] + " ";
                }
            }
            return result.trim();
        }
        public static void main(String[] args) {
            String sentence = "Java is very easy";
            String oldWord = "easy";
            String newWord = "powerful";
            String output = replaceWord(sentence, oldWord, newWord);
            System.out.println("Modified Sentence: " + output);
        }
    }


