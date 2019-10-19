//输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,


import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int[] nk = new int[k];
        if(k > input.length || k < 1 || input.length == 0) {
            return new ArrayList<>();
        }
        for(int i=0; i<k; i++) {
            nk[i] = input[i];
        }
        for(int i=k; i<input.length; i++) {
            Arrays.sort(nk);
            if(input[i] > nk[k-1])
                continue;
            if(input[i] < nk[k-1]){
                nk[k-1] = input[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>(nk.length);
        for(int i=0; i<k; i++)
            list.add(nk[i]);
        return list;
    }
}
