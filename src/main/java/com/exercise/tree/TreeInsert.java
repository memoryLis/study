package com.exercise.tree;

/**
 * ClassName: TreeInsert
 * Package: com.guang.exercise.tree
 * Description:
 *
 * @Author liang
 * @Create 2025/6/7 20:59
 * @Version jdk17.0   leetcode 701 二叉搜索树的插入
 */
public class TreeInsert {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null){
            return new TreeNode(val);
        }

       insert(root, val);
        return root;
    }

    public void insert(TreeNode root, int val) {
        if(val < root.val && root.left == null){
            root.left = new TreeNode(val);
            return;
        }else if (val > root.val && root.right == null){
            root.right = new TreeNode(val);
            return;
        }
        if(root.val > val && root.left != null){
            insert(root.left, val);
        }else if(root.val < val && root.right != null){
            insert(root.right, val);
        }


    }
}
