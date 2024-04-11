package Lab.Lab3;

public class ArrayBagDemo {
    public static void main(String[] args) {
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();

        String[] contentsOfBag1 = { "A", "A", "B", "A", "C", "A" };
        String[] contentsOfBag2 = { "A", "B", "A", "C", "B", "C", "D", "another string" };

        System.out.println("bag1: ");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);

        System.out.println("bag2: ");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);
        
        System.out.println("bag3:"); displayBag(bag1.union(bag2));
        System.out.println("bag4:"); displayBag(bag1.intersection(bag2));
        System.out.println("bag5:"); displayBag(bag1.difference(bag2));
    }

    private static void testAdd(BagInterface<String> aBag, String[] content){
        for(String item : content){
            aBag.add(item);
        }
    }

    private static void displayBag(BagInterface<String> aBag){
        Object[] load = aBag.toArray();
        System.out.println("The size of the bag: " + aBag.getCurrentSize());
        for(Object item : load){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
