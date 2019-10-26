//判断root2是不是root1的子树

public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        return  eq(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
        //root1和root2比较，root1左和root2，root1右和root2
    }
    public boolean eq(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null) {
            return true;
        }
        if(r1 == null) return false;
        if(r2 == null) return true;  //root2是root1的部分
        return (r1.val == r2.val) && eq(r1.left,r2.left) && eq(r1.right,r2.right);
    }
}
