/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtest;

/**
 *
 * @author Goh
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class EventManagementSystem {

    public static void main(String[] args) {
        String filename = "LabTest/events.txt";
        try {
            EventManager<Event> event = new EventManager<>();
            FileReader file = new FileReader(filename);
            BufferedReader br = new BufferedReader(file);
            String input;
            
            while ((input = br.readLine()) != null) {
                String[] info = input.split(",");
                String type = info[0];

                if (type.equals("Concert") || type.equals("Workshop") || type.equals("SportsGame")) {
                    if (type.equals("Concert")) {
                        Concert c1 = new Concert(info[1], info[2], info[3], info[4]);
                        event.addList(c1);;
                    } else if (type.equals("Workshop")) {
                        Workshop w1 = new Workshop(info[1], info[2], info[3], info[4], info[5]);
                        event.addList(w1);
                    } else if (info[0].equals("SportsGame")) {
                        SportsGame c1 = new SportsGame(info[1], info[2], info[3], info[4]);
                        event.addList(c1);
                    }
                }
            }

            event.DisplayList();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("E");
        }
    }
}
