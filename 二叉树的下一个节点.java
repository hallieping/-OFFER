// 中序遍历 ： 左 根 右

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null ) return null;
        //如果有右孩子
        if(pNode.right != null) {
            pNode = pNode.right;
            while(pNode.left != null){ //右孩子还有左孩子
                pNode = pNode.left;
            }
            return pNode;
        }
        //如果没有右孩子，找该节点是左孩子的父亲，一直找
        while(pNode.next != null) {
            if(pNode.next.left == pNode){
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;
    }
}
