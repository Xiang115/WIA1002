public class BST {

}
package Lab.Lab12;

import java.util.ArrayList;

import Lecture.Lecture12.Tree;

public class BST<E extends Comparable<E>> {
    protected TreeNode<E> root;
    protected int size;

    public BST() {
        root = null;
        size = 0;
    }

    public boolean search(E e) {
        if (root == null || size == 0) {
            return false;
        }
        TreeNode<E> temp = root;
        while (temp != null) {
            if (e.compareTo(temp.element) > 0) {
                temp = temp.right;
            } else if (e.compareTo(temp.element) < 0) {
                temp = temp.left;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
        } else {
            TreeNode<E> temp = root;
            TreeNode<E> parent = null;

            while (temp != null) {
                if (e.compareTo(temp.element) < 0) {
                    parent = temp;
                    temp = temp.left;
                } else if (e.compareTo(temp.element) > 0) {
                    parent = temp;
                    temp = temp.right;
                } else {
                    return false;
                }
            }

            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(e);
            } else {
                parent.right = new TreeNode<>(e);
            }
        }
        size++;
        return true;
    }

    public int getSize() {
        return size;
    }

    public int height() {
        return height(root);
    }

    public int height(TreeNode<E> node) {
        if (node == null) {
            return -1;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public E getRoot() {
        return root.element;
    }

    public E minValue() {
        if (root == null || size == 0) {
            return null;
        }
        TreeNode<E> temp = root;
        TreeNode<E> parent = null;
        while (temp != null) {
            parent = temp;
            temp = temp.left;
        }
        return parent.element;
    }

    public E maxValue() {
        if (root == null || size == 0) {
            return null;
        }
        TreeNode<E> temp = root;
        TreeNode<E> parent = null;

        while (temp != null) {
            parent = temp;
            temp = temp.right;
        }
        return parent.element;
    }

    public java.util.ArrayList<TreeNode<E>> path(E e) {
        if (search(e)) {
            ArrayList<TreeNode<E>> list = new ArrayList<>();
            TreeNode<E> current = root;

            while (current != null) {
                list.add(current);
                if (e.compareTo(current.element) == 0) {
                    break;
                }
                current = (e.compareTo(current.element) > 0) ? current.right : current.left;
            }

            return list;
        } else {
            return null;
        }
    }

    public boolean delete(E e) {
        if (!search(e)) {
            return false;
        }
        TreeNode<E> current = root;
        TreeNode<E> parent = null;

        while (current.element.compareTo(e) != 0) {
            parent = current;
            current = (e.compareTo(current.element) > 0) ? current.right : current.left;
        }

        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        } else {
            TreeNode<E> rightmost = current.left;
            TreeNode<E> ParentRightmost = current;

            while (rightmost.right != null) {
                ParentRightmost = rightmost;
                rightmost = rightmost.right;
            }

            current.element = rightmost.element;

            if (ParentRightmost.right == rightmost) {
                ParentRightmost.right = rightmost.left;
            } else {
                ParentRightmost.left = rightmost.left;
            }
        }
        size--;
        return true;
    }

    public boolean clear() {
        root = null;
        size = 0;
        return true;
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null)
            return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
}