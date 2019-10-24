
// 先从左往右，下一层从右往左

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    if(pRoot == null){
        return result;
    }
        boolean leftToRight = true;
        Queue<TreeNode> layer = new LinkedList<TreeNode>();
        ArrayList<Integer> layerList = new ArrayList<Integer>();
        layer.add(pRoot);
        int start = 0, end = 1;
        while(!layer.isEmpty()){
            TreeNode cur = layer.remove();
            layerList.add(cur.val);
            start++;
            if(cur.left!=null){
                layer.add(cur.left);          
            }
            if(cur.right!=null){
                layer.add(cur.right);
            }
            if(start == end){
                end = layer.size();
                start = 0;             
                if(!leftToRight){
                    result.add(reverse(layerList));
                }else{
                    result.add(layerList);
                }
                leftToRight = !leftToRight;
                layerList = new ArrayList<Integer>();
            }
        }
        return result;
}
    private ArrayList reverse(ArrayList<Integer> layerList) {    
        int length = layerList.size();
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        for(int i = length-1; i >= 0;i--){
            reverseList.add(layerList.get(i));
        }
        return reverseList;
    }
}
