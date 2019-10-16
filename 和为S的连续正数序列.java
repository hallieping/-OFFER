import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(sum < 3) return res;
        int l = 1, r = 2;
        while(l < r) {
            int tmp = (l+r)*(r-l+1)/2 - sum;
            if(tmp == 0 ) {
                ArrayList<Integer> list = new ArrayList<>(); 
                for(int i=l; i<=r; i++)
                    list.add(i);
                res.add(list);
                l++;
            }
            else if(tmp < 0) {
                r++;
            }
            else
                l++;
        }
    return res;
    }
}
