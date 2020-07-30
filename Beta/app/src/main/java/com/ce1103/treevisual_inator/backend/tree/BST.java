package com.ce1103.treevisual_inator.backend.tree;

import java.util.LinkedList;

public class BST<T extends Comparable<T>> {

    private TreeNode<T> root;


    public LinkedList<T> inOrder() {
        return this.inOrder(this.root, new LinkedList<T>());
    }

    private LinkedList<T> inOrder(TreeNode<T> node, LinkedList<T> result) {
        if (node == null) {
            return new LinkedList<>();
        } else {
            inOrder(node.getLeft(), result);
            result.add(node.getData());
            inOrder(node.getRight(), result);
        }
        return result;
    }

    public void insert(T newData) {
        TreeNode<T> newNode = new TreeNode<>(newData);
        //Caso en que el arbol esta vacio
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode<T> temp = root;
        boolean inserted = false;

        while (!inserted) {
            if (temp.getData().compareTo(newData) == 0) {
                throw new IllegalArgumentException("Repeated node, cannot insert");

            } else if (temp.getData().compareTo(newData) < 0) {
                if (temp.getRight() != null) {
                    temp = temp.getRight();
                } else {
                    temp.setRight(newNode);
                    inserted = true;
                }
            } else if (temp.getData().compareTo(newData) > 0) {
                if (temp.getLeft() != null) {
                    temp = temp.getLeft();
                } else {
                    temp.setLeft(newNode);
                    inserted = true;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                '}';
    }

    public TreeNode<T> getRoot() {
        return this.root;
    }
}