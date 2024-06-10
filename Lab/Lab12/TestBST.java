package Lab.Lab12;

import java.util.ArrayList;

public class TestBST {
    public static void main(String[] args) {

        int[] inputData = { 45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14 };
        System.out.print("Input Data: ");
        BST<Integer> bst = new BST<>();

        for (int data : inputData)
            bst.insert(data);

        for (int i = 0; i < inputData.length; i++) {
            if (i == inputData.length - 1) {
                System.out.println(inputData[i]);
            }else{
                System.out.print(inputData[i] + ", ");
            }
        }

        System.out.print("Inorder (sorted): ");
        bst.inorder(bst.root);
        System.out.println();
        System.out.print("Postorder: ");
        bst.postorder(bst.root);
        System.out.println();
        System.out.print("Preorder: ");
        bst.preorder(bst.root);
        System.out.println();

        System.out.printf("Height of BST: %d\n", bst.height());
        System.out.printf("Root for BST is: %s\n", bst.getRoot().toString());
        System.out.printf("Check whether 10 is in the tree?: %s\n", bst.search(10));

        if (bst.delete(53))
            System.out.println("Delete 53");

        System.out.print("Updated Inorder data (sorted): ");
        bst.inorder(bst.root);
        System.out.println();

        System.out.printf("Min Value: %s\n", bst.minValue().toString());
        System.out.printf("Max Value: %s\n", bst.maxValue().toString());

        System.out.print("A path from the root to 6 is: ");
        ArrayList<TreeNode<Integer>> path = bst.path(6);
        for (TreeNode<Integer> node : path)
            System.out.printf("%s ", node.element.toString());
        System.out.println();
    }
}
