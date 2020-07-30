package com.ce1103.treevisual_inator.backend.tree;

import java.util.Objects;

public class TreeNode<T extends Comparable<T>> {
    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public T getData() {
        return data;
    }

    public TreeNode(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}