// 搜索树：左边小于等于根，右边大于根


//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
//如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

//数组最后一个为根，分出左子树和右子树。递归不断判断左子树和右子树也是后序遍历





public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) {
            return false;
        }
        return isPost(sequence,0,sequence.length-1);
    }
    public boolean isPost(int[] s, int left, int right) {
        if(left > right) return true;
        int i = right;
        while( i > left && s[i-1] > s[right]) 
            i--;
        for(int j = i-1; j>=left; j--) {
            if(s[j] > s[right])
                return false;
        }
        return isPost(s,left,i-1) && isPost(s,i,right-1);
        
    }
}
