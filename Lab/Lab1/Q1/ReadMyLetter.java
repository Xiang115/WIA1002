package Lab.Lab1.Q1;

import java.io.*;
import java.util.Scanner;

public class ReadMyLetter {
    public static void main(String[] args) {
        try{
            //Part 1
            String filepath = "Lab\\Lab1\\Q1\\GOH_23004987.txt";
            Scanner sc = new Scanner(new FileInputStream(filepath));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();

            //Part 2
            sc = new Scanner(System.in);
            PrintWriter write = new PrintWriter(new FileOutputStream(filepath,true));
            System.out.print("Add something new: ");
            write.println();
            while(sc.hasNextLine()){
                write.println(sc.nextLine());
            }
            write.close();
            sc.close();

            sc = new Scanner(filepath);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
