// 给前序遍历 和 中序遍历

//思路 ： 前序s 根左右， 中序s 左根右
//        所以前序第一个值肯定是当前根， 中序中根位置左边是左子树，右边是右子树；
//        递归的求解
//        中序根 的位置i ，前序和中序中都是 根+左个数为i+1,所以可以根据中序中i来求左子树的前序，右子树的前序。

import java.util.Arrays;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        
        if(pre.length == 0) return null;
        TreeNode root = new TreeNode(pre[0]);
        if(pre.length == 1) return root;
        int i = 0;
        for(i=0; i<in.length; i++) {
            if(in[i] == root.val)
                break;
        }
        
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in,0,i));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length), Arrays.copyOfRange(in,i+1,in.length));
        return root;
    }
}
