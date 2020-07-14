package com.ncu.tree;

public class ConvertToSearchTree {



    public TreeNode convert(int[] nums,int left,int right){
        int mid = (left + right)/2;
        if(left > right) return null;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums,left,mid - 1);
        root.right = convert(nums,mid + 1,right);
        return root;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
