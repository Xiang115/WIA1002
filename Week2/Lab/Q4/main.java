package Week2.Lab.Q4;

public class main {
    public static void main(String[] args) {
        Integer[] intArray = { 5, 3, 7, 1, 4, 9, 8, 2 };
        String[] strArray = { "red", "blue", "orange", "tan" };

        minmax(intArray);
        minmax(strArray);
    }

    public static <T extends Comparable<T>> void minmax(T[] arr){
        T min = arr[0];
        T max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(min.compareTo(arr[i])>0){
                min = arr[i];
            }
            if(max.compareTo(arr[i])<0){
                max = arr[i];
            }
        }
        System.out.printf("Min = %s     Max = %s\n",min,max);
    }
}
