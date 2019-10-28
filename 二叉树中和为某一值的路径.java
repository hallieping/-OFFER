public class Solution {
    public ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    public ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        
        if(root == null) return listAll;
        list.add(root.val);
        target = target - root.val;
        if(target == 0 && root.left == null && root.right == null) {
            listAll.add(new ArrayList<>(list));
            
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }
}
