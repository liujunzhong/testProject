package com.ncu.tree;

public class TreeDepth {
    public static int depth(TreeNode root){
        if(root == null) return 0;
        return 1 + depth(root.left) + depth(root.right);
    }
}
