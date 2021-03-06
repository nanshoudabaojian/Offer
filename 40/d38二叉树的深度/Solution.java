package d38二叉树的深度;

/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 
 * 递归
 * 抽象成已获知到了左右子树的最大深度，那么只需要将最大深度+1即可
 * 
 * @author nanshoudabaojian
 *
 */
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right)+1;
    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}