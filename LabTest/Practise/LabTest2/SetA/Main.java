package LabTest.Practise.LabTest2.SetA;

public class Main {
    public static void main(String[] args) {
        Stack<Person> raw = new Stack<>("Raw list");
        raw.push("ali", 32, "m", "doctor");
        raw.push("lisa", 29, "f", "nurse");
        raw.push("tanaka", 41);
        raw.push("ahmad", 18, "m", "developer");
        raw.push("maria", 20, "f", "accountant");
        raw.push("chong", 70, "m", "lawyer");
        raw.push("raju", 55, "m", "police");
        raw.push("alex", 16, "f", "business man ");
        Person katie = new Person("katie", 36, "f", "teacher");
        raw.push(katie);
        raw.displayStack();
        System.out.println();

        Stack<Person> frontliner = new Stack<>("Frontliner");
        Stack<Person> others = new Stack<>("Others");

        while (!raw.isEmpty()) {
            Person temp = raw.peek();
            if (temp.SetFrontlier()) {
                frontliner.push(raw.pop());
            } else {
                others.push(raw.pop());
            }
        }

        System.out.println("~~~~~~~Sort into frontliners and others~~~~~");
        raw.displayStack();
        System.out.println("-------------------");
        frontliner.displayStack();
        System.out.println("-------------------");
        others.displayStack();
        System.out.println("-------------------");
        System.out.println();

        Stack<Person> priority = new Stack<>("Vaccine Priority List");

        while (!others.isEmpty()) {
            others = HighPriority(others);
            priority.push(others.pop());
        }

        while (!frontliner.isEmpty()) {
            frontliner = HighPriority(frontliner);
            priority.push(frontliner.pop());
        }
        System.out.println("~~~~~~~Sort into Vaccine list~~~~~");
        others.displayStack();
        System.out.println("-------------------");
        frontliner.displayStack();
        System.out.println("-------------------");
        priority.displayStack();
    }

    private static Stack<Person> HighPriority(Stack<Person> stack) {
        int min = Integer.MAX_VALUE;
        Stack<Person> temp = new Stack<>(stack.stack_name);
        Person mamba = null;
        while (!stack.isEmpty()) {
            if (stack.peek().age < min) {
                if(mamba != null){
                    temp.push(mamba);
                }
                mamba = stack.pop();
                min = mamba.age;
            }else{
                temp.push(stack.pop());
            }
        }
        temp.push(mamba);
        return temp;
    }
}
