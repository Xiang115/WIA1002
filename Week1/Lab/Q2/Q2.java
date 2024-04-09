package Week1.Lab.Q2;

import java.io.*;
import java.util.*;

public class Q2 {
    public static String[] delimiters = { ",", ";" };
    static int totalChars;

    public static void main(String[] args) {
        String[] filePaths = { 
        "C:\\Users\\Goh\\Documents\\NetBeansProjects\\WIA1002\\src\\main\\java\\Week1\\Lab\\text1.txt", 
        "C:\\Users\\Goh\\Documents\\NetBeansProjects\\WIA1002\\src\\main\\java\\Week1\\Lab\\text2.txt", 
        "C:\\Users\\Goh\\Documents\\NetBeansProjects\\WIA1002\\src\\main\\java\\Week1\\Lab\\text3.txt",
        "C:\\Users\\Goh\\Documents\\NetBeansProjects\\WIA1002\\src\\main\\java\\Week1\\Lab\\text4.txt" 
    };
        for (String filePath : filePaths) {
            load(filePath);
            System.out.println();
        }
    }

    public static void load(String file) {
        int lineCount = 0; totalChars = 0;
        StringBuilder texts = new StringBuilder(); 
        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            while (sc.hasNextLine()) {
                sc.nextLine(); 
                lineCount++;
            }
            String[] lines = new String[lineCount];
            sc.close();

            sc = new Scanner(new FileInputStream(file));
            for (int i = 0; i < lineCount; i++) {
                lines[i] = modify(sc.nextLine()) + "\n";
                texts.append(lines[i]); 
            }
            sc.close();
            for (String line : lines) { 
                totalChars += line.trim().length();
            }
            System.out.println("Processed content of " + file + "\n" + texts);
            System.out.println("Total characters: " + totalChars);
        }catch (FileNotFoundException e) {
            System.out.println("Error processing file: " + file + ", Message: " + e.getMessage());
        }
    }

    public static String modify(String text) {
        StringBuilder mod = new StringBuilder();
        for (String delimiter : delimiters) {
            if (text.contains(delimiter)) {
                String[] parts = text.split(delimiter);
                for (String part : parts) {
                    mod.append(part);
                }
                break;
            }
        }
        if (mod.length() == 0) { 
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    mod.append(c);
                }
            }
        }
        return mod.toString();
    }
}