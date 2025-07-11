package com.exercise.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class ForTree {
       // 前序遍历

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
  
        test(list, root);
        return  list;
    }


    public void test(List list,TreeNode node){
        list.add(node.val);
        if(node.left!=null){
            test(list,node.left);
        }

        if(node.right!=null){
            test(list,node.right);
        }

}
}