public class Solution {
    public int TreeDepth(TreeNode root) {
        int sum = 0;
        if(root == null) return sum;
        if(root.left == null && root.right == null)
            return 1;
        int l = TreeDepth(root.left);
        int r = TreeDepth(root.right);
        
        return l > r ? l + 1 : r + 1;
       
    }
}
