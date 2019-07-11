package com.CK;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    private Queue<TreeNode> bfArray;

    TreeNode(int x) {
        val = x;
    }

    void printTree() {
        bfArray = new LinkedList<>();
        bfArray.add(this);
        traverseBF();
    }

    public void traverseBF() {
        while (!bfArray.isEmpty()) {
            TreeNode node = bfArray.poll();
            System.out.println(node.val);
            if (node.left != null) bfArray.add(node.left);
            if (node.right != null) bfArray.add(node.right);
            traverseBF();
        }
    }

}
