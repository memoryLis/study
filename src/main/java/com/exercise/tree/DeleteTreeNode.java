package com.exercise.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DeleteTreeNode
 * Package: com.guang.exercise.tree
 * Description:
 *
 * @Author liang
 * @Create 2025/6/8 20:18
 * @Version jdk17.0
 */
public class DeleteTreeNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        /**
         1 先找到要删除的结点,和其前一个结点
         2 如果要被删除结点是叶子结点，直接删除
         3 如果要删除结点不是叶子结点，但是没有左子树或者没有右子树，这时把存在的子树直接挂载到父节点中
         4 如果要删除的结点左右子树都有，这时把右子树挂载到父节点上，左子树挂载到右子树上最小结点上 */
        if(root == null){
            return null;
        }
       List<TreeNode> deleteNodeList = select(root,key);
       if(deleteNodeList == null){
           return root;//没有要删除的
       }

       //不为空，进行删除
       TreeNode result =  delete(deleteNodeList,root);
       return result;





    }

    private TreeNode delete(List<TreeNode> deleteNodeList,TreeNode root) {
        TreeNode pNode = deleteNodeList.get(0);
        TreeNode childNode = deleteNodeList.get(1);//要删除的结点
        if(pNode == null){
            //删除的是头节点，如果左右子树都为空
            if(childNode.left == null && childNode.right == null){
                return null;
            }
            if(childNode.left == null && childNode.right != null){
                //左为空，右不为空
                return childNode.right;
            }
            if(childNode.left != null && childNode.right == null){
                return childNode.left;
            }
            if(childNode.left != null && childNode.right != null){
                TreeNode minNode = selectMin(childNode.right);//寻找右子树最小值
               minNode.left = childNode.left;
                return childNode.right;
            }

        }
        //删除的不是头结点
        if(childNode.left == null && childNode.right == null){
            if(pNode.right == childNode){
                pNode.right = null;
                return root;
            }
            if(pNode.left == childNode){
                pNode.left = null;
                return root;
            }
        }
        if(childNode.left == null && childNode.right != null){
            //左为空，右不为空
            if(pNode.right == childNode){
                pNode.right = childNode.right;
                return root;
            }
            if(pNode.left == childNode){
                pNode.left = childNode.right;
                return root;
            }
        }
        if(childNode.left != null && childNode.right == null){
            //右为空，左不为空
            if(pNode.right == childNode){
                pNode.right = childNode.left;
                return root;
            }
            if(pNode.left == childNode){
                pNode.left = childNode.left;
                return root;
            }

        }
        if(childNode.left != null && childNode.right != null){
            //左右都不为空
            TreeNode minNode = selectMin(childNode.right);//寻找右子树最小值
            minNode.left = childNode.left;
            if(pNode.left == childNode){
                pNode.left = childNode.right;
                return root;
            }
            if(pNode.right == childNode){
                pNode.right = childNode.right;
                return root;
            }

        }
        return root;

    }

    private TreeNode selectMin(TreeNode treeNode) {
        if(treeNode.left == null){
            return treeNode;
        }
        if(treeNode.left != null){
            return selectMin(treeNode.left);
        }
        return null;

    }


    private List<TreeNode> select(TreeNode root, int key) {
        if(root.val == key) {
            ArrayList<TreeNode> treeNodes = new ArrayList<>();
            treeNodes.add(null);
            treeNodes.add(root);
            return  treeNodes;
        }

        if(root.left!=null && root.left.val==key){
            ArrayList<TreeNode> treeNodes = new ArrayList<>();
            treeNodes.add(root);
            treeNodes.add(root.left);
            return  treeNodes;
        }

        if(root.right!=null && root.right.val==key){
            ArrayList<TreeNode> treeNodes = new ArrayList<>();
            treeNodes.add(root);
            treeNodes.add(root.right);
            return  treeNodes;
        }
        if(root.left != null) {
            List<TreeNode> result = select(root.left, key);
            if(result!=null&&result.size() > 0){
                return  result;
            }
        }
        if(root.right != null) {
            List<TreeNode> result = select(root.right, key);
            if(result!=null&&result.size() > 0){
                return  result;
            }
        }
        return null;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        root.right.left = null;
        DeleteTreeNode treeNode = new DeleteTreeNode();
        TreeNode node = treeNode.deleteNode(root, 7);
    }
}
