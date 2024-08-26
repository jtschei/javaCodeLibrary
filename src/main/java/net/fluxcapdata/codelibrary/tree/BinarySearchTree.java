package net.fluxcapdata.codelibrary.tree;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    class Node<T>  {
        private Node<T> left;
        private Node<T> right;
        private final T value;
        public Node(T value) {
            this.left = null;
            this.right = null;
            this.value = value;
        }
        public Node<T> getLeft() {
            return this.left;
        }
        public void setLeft(Node<T> n) {
            this.left = n;
        }
        public Node<T> getRight() {
            return this.right;
        }
        public void setRight(Node<T> n) {
            this.right = n;
        }
        public T getValue() {
            return value;
        }
    }

    private Node<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    @Override
    public void add(T value) {
        if (this.root == null) {
            this.root = new Node<>(value);
        } else {
            this.doAdd(value,this.root);
        }
    }

    @Override
    public T get(T value) {
        return doGet(value, this.root);
    }

    public List<T> getInOrder() {
        List<T> list = new LinkedList<T>();
        doOrderTraverse(this.root, list);
        return list;
    }

    public List<T> getInReverseOrder() {
        List<T> list = new LinkedList<T>();
        doReverseOrderTraverse(this.root, list);
        return list;
    }

    public List<T> getInPreOrder() {
        List<T> list = new LinkedList<T>();
        doPreOrderTraverse(this.root, list);
        return list;
    }

    private void doAdd(T value, Node<T> parent) {
        if (value.compareTo(parent.getValue()) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(new Node<>(value));
            } else {
                doAdd(value, parent.getLeft());
            }
        }
        else if (value.compareTo(parent.getValue()) > 0) {
            if (parent.getRight() == null) {
                parent.setRight(new Node<>(value));
            } else {
                doAdd(value, parent.getRight());
            }
        }
    }

    private T doGet(T value, Node<T> parent) {
        if (value.compareTo(parent.getValue()) == 0) {
            return parent.getValue();
        } else if (value.compareTo(parent.getValue()) < 0) {
            if (parent.getLeft() == null) { return null; }
            return doGet(value, parent.getLeft());
        } else {
            if (parent.getRight() == null) { return null; }
            return doGet(value, parent.getRight());
        }
    }

    private void doOrderTraverse(Node<T> parent, List<T> list) {
        if (parent == null) {
            return;
        }
        doOrderTraverse(parent.getLeft(), list);
        list.add(parent.getValue());
        doOrderTraverse(parent.getRight(), list);
    }

    private void doReverseOrderTraverse(Node<T> parent, List<T> list) {
        if (parent == null) {
            return;
        }
        doReverseOrderTraverse(parent.getRight(), list);
        list.add(parent.getValue());
        doReverseOrderTraverse(parent.getLeft(), list);
    }

    private void doPreOrderTraverse(Node<T> parent, List<T> list) {
        if (parent == null) {
            return;
        }
        list.add(parent.getValue());
        doPreOrderTraverse(parent.getLeft(), list);
        doPreOrderTraverse(parent.getRight(), list);
    }

    private void doPostOrderTraverse(Node<T> parent, List<T> list) {
        if (parent == null) {
            return;
        }
        doPreOrderTraverse(parent.getLeft(), list);
        doPreOrderTraverse(parent.getRight(), list);
        list.add(parent.getValue());
    }
}
