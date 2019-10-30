public class Solution {
    int cnt = 0;
    TreeNode tmp = null;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null ) return null;
        KthNode(pRoot.left,k);
        cnt++;
        if(cnt == k)
            tmp = pRoot;
        KthNode(pRoot.right,k);
        return tmp;
    }
}

链接：https://www.nowcoder.com/questionTerminal/ef068f602dde4d28aab2b210e859150a
来源：牛客网
