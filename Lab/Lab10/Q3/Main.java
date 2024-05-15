package Lab.Lab10.Q3;

public class Main {
    public static long exponenet(int x, int m){
        if(m == 0){
            return 1;
        }
        return x * exponenet(x, m-1);
    }
}
