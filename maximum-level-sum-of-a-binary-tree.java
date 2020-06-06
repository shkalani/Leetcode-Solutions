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
    public int maxLevelSum(TreeNode root) {
        if(root==null)
            return 1;
        int currentlevel=0, level=1;
        int max=Integer.MIN_VALUE, sum=0;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            sum=0;
            currentlevel++;
            int count = q.size();
            while(count!=0){
                TreeNode temp = q.pop();
                sum+=temp.val;
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                count--;
            }
            if(sum>max){
                    max=sum;
                    level=currentlevel;
                }
        }
        return level;
        
    }
}