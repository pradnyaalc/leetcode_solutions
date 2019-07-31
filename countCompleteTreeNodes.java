import java.lang.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        
        int leftHeight = leftHeight(root)+1;
        int rightHeight = rightHeight(root)+1;
        
        if (leftHeight == rightHeight){
            int cnt = (int)Math.pow(2, leftHeight);
            return cnt-1;
        }else{
            return countNodes(root.left)+countNodes(root.right)+1;
        }
        
    }
    
    public int leftHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int cnt = 0;
        while(node.left != null){
            cnt++;
            node = node.left;
        }
        return cnt;
    }
    
    
    public int rightHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int cnt = 0;
        while(node.right != null){
            cnt++;
            node = node.right;
        }
        
        return cnt;
    }
}
