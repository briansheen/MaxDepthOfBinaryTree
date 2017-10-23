package com.example;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(1);
        TreeNode f = new TreeNode(1);
        TreeNode x = new TreeNode(1);
        TreeNode y = new TreeNode(1);
        TreeNode z = new TreeNode(1);
        root.left = a;
        a.right = b;
        a.left = f;
        b.right = c;
        c.left = d;
        d.right = e;
        root.right = x;
        x.left = y;
        y.left = z;
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root){
        int maxLeft = 1;
        int maxRight = 1;
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left!=null){
            maxLeft += maxDepth(root.left);
        }
        if(root.right!=null){
            maxRight += maxDepth(root.right);
        }
        if(maxLeft > maxRight){
            return maxLeft;
        }
        return maxRight;
    }
}
