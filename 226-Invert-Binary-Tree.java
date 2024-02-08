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
    public TreeNode invertTree(TreeNode root) {
        
    // ITERATIVE METHOD 

    // if(root == null) {
    //     return root; 
    // }

    // Stack<TreeNode> s = new Stack<TreeNode>(); 
    // s.add(root); 

    // while(!s.isEmpty()){
    //     TreeNode rootNode = s.pop(); 
    //     TreeNode temp = rootNode.left; 

    //     rootNode.left = rootNode.right; 
    //     rootNode.right = temp; 

    //     if(rootNode.left !=null){
    //         s.add(rootNode.left); 
    //     }
    //      if(rootNode.right !=null){
    //         s.add(rootNode.right); 
    //     }
    // }

    // return root; 

    //RECURSIVE METHOD 
    if(root==null){
        return root; 
    }

    invertTree(root.left); 
    invertTree(root.right); 

    TreeNode tempLeft = root.left; 
    root.left = root.right; 
    root.right=tempLeft; 

    return root; 

    }
}
