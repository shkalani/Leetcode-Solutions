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
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t2==null)
            return t1;
        if(t1==null)
            return t2;
        t1.val+=t2.val;
        t1.left=mergeTrees(t1.left, t2.left);
        t1.right=mergeTrees(t1.right, t2.right);
        return t1;
        
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 151d87eb217b0fae43c19cb4a62d7f28c0f70c18
