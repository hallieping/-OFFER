class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        if(root.left != null)
            root.left = invertTree(root.left);
        if(root.right != null)
            root.right = invertTree(root.right);    
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }
}
