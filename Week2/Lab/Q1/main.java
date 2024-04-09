package Week2.Lab.Q1;

public class main {
    public static void main(String[] args) {
        MyGeneric<String> strobj = new MyGeneric<>();
        MyGeneric<Integer> intobj = new MyGeneric<>();

        strobj.setE("abc");
        intobj.setE(200);

        System.out.println(strobj.getE());
        System.out.println(intobj.getE());
    }
}
