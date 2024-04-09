package Week2.Tutorial;

public class MyArray {
    public static void main(String[] args) {
        Integer[] integers = { 1, 2, 3, 4, 5 };
        String[] strings = { "Jam", "Tom", "Bob" };
        Character[] characters = { 'a', 'b', 'c' };

        // list(integers);
        // list(strings);
        // list(characters);
        listAll(integers, strings, characters);
    }

    public static <T> void list(T[] arr) {
        for (T arrs : arr)
            System.out.print(arrs + " ");
        System.out.println();
    }

    public static <T> void listAll(T[]... arrays) {
        for(T[] arr : arrays){
            for(T item : arr){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static <T> void listAll(T[] arr1, T[] arr2, T[] arr3) {
        list(arr1);
        list(arr2);
        list(arr3);
    }
}
