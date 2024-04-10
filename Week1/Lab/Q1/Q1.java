package Week1.Lab.Q1;

import java.io.*;

public class Q1 {
    public static void main(String[] args) {
        try {
            try (PrintWriter writer = new PrintWriter(new FileOutputStream("GOH_23004987.txt"))) {
                writer.println("Wednesday, 13 March 2024");
                writer.println("""
                        My name is GOH KIAN XIANG with matrix number, 23004987. I am
                        majoring in Information Systems. This is my first time taking the
                        Data Structure subject. At the moment, I am feeling excited about taking this
                        subject. This is because I can learn lots of things form it.""");
                writer.println("""
                        I acquired B for my previous Programming 1 course. It\u2019s not too bad. So, I
                        think I can manage to get A for this DS subject this term. In order
                        to do well in the subject, I will do practice until dead. Wish me luck!!!""");
            }
        } catch (IOException e) {
            System.out.println("Problem with input");
        }
    }
}
