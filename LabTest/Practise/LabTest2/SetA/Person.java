package LabTest.Practise.LabTest2.SetA;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    protected int age;
    private String gender;
    private String occupation;
    private ArrayList<String> occupation_list = new ArrayList<>(
            List.of("doctor", "nurse", "teacher", "police"));
    private boolean frontlier;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
    }

    public boolean SetFrontlier() {
        return occupation_list.contains(occupation);
    }

    public String toString() {
        return String.format("%s %d %s %s", name, age, gender, (SetFrontlier()) ? "Frontliner" : "Not frontliner");
    }
}
