package Lab.Lab12;

public class TreeNode<E extends Comparable<E>>{
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    protected E element;

    public TreeNode(E element) {
        this.element = element;
    }
}