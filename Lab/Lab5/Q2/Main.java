package Lab.Lab5.Q2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your student name list. Enter \'n\' to end .....");
        String name = sc.nextLine();
        while(!name.equals("n")){
            list.add(name);
            name = sc.nextLine();
        }

        System.out.println("\nYou have entered the following student's name : ");
        list.printList();

        System.out.println("\nThe number of students entered is : " + list.getSize());

        System.out.println("\nAll the names entered are correct? Enter \'r\' to rename the "
            + "student's name, \'n\' to proceed");
        char choice = sc.nextLine().charAt(0);

        if(choice == 'r'){
            System.out.println("\nEnter the existing student name that u want to rename : ");
            String oldname = sc.nextLine();
            while(!list.contains(oldname)){
                System.out.print("Name not found. Enter the name again: ");
                oldname = sc.nextLine();
            }
            System.out.println("\nEnter the new name: ");
            list.replace(oldname, sc.nextLine());
            System.out.println("\nThe new student list is : ");
            list.printList();
        }
        
        System.out.println("\nDo you want to remove any of your student's name? Enter \'y\' for yes, \'n\' yo proceed.");
        choice = sc.nextLine().charAt(0);

        if(choice == 'y'){
            System.out.println("\nEnter a student's name to remove : ");
            String Rename = sc.nextLine();
            while(!list.contains(Rename)){
                System.out.print("Name not found. Enter the name again: ");
                Rename = sc.nextLine();
            }
            list.removeElement(Rename);
        }

        System.out.println("\nThe number of updated student is : " + list.getSize());
        System.out.println("The updated students list is : ");
        list.printList();

        System.out.println("\nAll student data captured complete. Thank you!");
    }
}
