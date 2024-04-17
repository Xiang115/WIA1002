package Lab.Lab5.Q1;

public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();
        // 1)
        list.appendEnd("Linked List");
        list.appendEnd("is");
        list.appendEnd("easy");

        //2)
        list.display();

        //3)
        list.removeInitial();
        list.display();

        //4)
        System.out.println("Does \"difficult\" contains in the list? " + list.contains("difficult"));

        //5)
        list.clear();
    }
}
