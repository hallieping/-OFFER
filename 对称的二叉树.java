//判断是否镜像

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return isMirror(pRoot,pRoot);
        
    }
    boolean isMirror(TreeNode l,TreeNode r) {
        if(l == null && r == null) return true;
        else if(l == null || r == null) return false;
        else return (l.val == r.val) && isMirror(l.left,r.right) && isMirror(l.right, r.left);
    }   
}
