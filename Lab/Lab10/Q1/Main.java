package Lab.Lab10.Q1;

public class Main {
    public static String Replace(String word) {
        if (word.isEmpty()) {
            return "";
        }
        char first = (word.charAt(0) == 'a') ? 'i' : word.charAt(0);
        return first + Replace(word.substring(1));
    }
}
