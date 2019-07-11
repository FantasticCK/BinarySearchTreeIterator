package com.CK;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(20);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(4);
        TreeNode node9 = new TreeNode(8);
        TreeNode node10 = new TreeNode(9);
        TreeNode node11 = new TreeNode(4);
        TreeNode node12 = new TreeNode(4);
        TreeNode node13 = new TreeNode(9);
        TreeNode node14 = new TreeNode(8);

        root.left = node1;
        root.right = node2;
//        node1.left = node3;
//        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
//        node4.left = node9;
//        node4.right = node10;
//        node6.left = node13;
//        node6.right = node14;

        root.printTree();
        BSTIterator iterator = new BSTIterator(root);
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
    }
}

class BSTIterator {
    private List<Integer> dfRes;
    private Iterator<Integer> itr;

    public BSTIterator(TreeNode root) {
        this.dfRes = new ArrayList<>();
        this.traverseDF(root);
        this.itr = dfRes.iterator();
        System.out.println("");
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        if (hasNext()) return itr.next();
        else return 0;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return itr.hasNext();
    }

    private void traverseDF(TreeNode root) {
        if (root == null) return;
        traverseDF(root.left);
        dfRes.add(root.val);
        traverseDF(root.right);
    }
}
