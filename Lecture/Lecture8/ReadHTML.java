package Lecture.Lecture8;

import java.util.*;
import java.io.*;

public class ReadHTML {
    public static void main(String[] args) {
        String sb = "";
        try {
            Scanner sc = new Scanner(new FileInputStream("Lecture\\Lecture8\\test.html"));
            while(sc.hasNextLine()){
                sb += sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
        System.out.println(isHTMLMatched(sb));
    }

    public static boolean isHTMLMatched(String html) {
        Stack<String> buffer = new Stack<>();
        int j = html.indexOf('<'); // find first ’<’ character (if any)
        while (j != -1) {
            int k = html.indexOf('>', j + 1); // find next ’>’ character
            if (k == -1)
                return false; // invalid tag

            String tag = html.substring(j + 1, k); // strip away < >
            if (!tag.startsWith("/")) // this is an opening tag
                buffer.push(tag);
            else { // this is a closing tag
                if (buffer.isEmpty())
                    return false; // no tag to match
                if (!tag.substring(1).equals(buffer.pop()))
                    return false; // mismatched tag
            }
            
            j = html.indexOf('<', k + 1); // find next ’<’ character (if any)
        }
        return buffer.isEmpty(); // were all opening tags matched?
    }
}
