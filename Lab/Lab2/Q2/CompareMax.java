package Lab.Lab2.Q2;

public class CompareMax {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 100;
        int num3 = 500;

        System.out.print("The maximum of theree value: ");
        maximum(num1, num2, num3);
    }

    public static<T extends Comparable<T>> void maximum(T a, T b, T c){
        if(a.compareTo(b)>0 && a.compareTo(c)>0){
            System.out.println(a);
        }else if(b.compareTo(a)>0 && b.compareTo(c)>0){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
