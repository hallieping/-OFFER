import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(array.length<=1)
            return res;   
        int l = 0; 
        int r = array.length-1;
        int min = array[l]*array[r];
        int s1=array[0];
        int s2=array[r];
        boolean real = false;
        while(l < r) {
            if(array[l] == sum - array[r]) {
                min =array[l] * array[r];
                s1 = array[l];
                s2 = array[r];
                break;
            }
            else if(array[l] < sum - array[r]) {
                l++;
                continue;
            }
            else {
                r--;
            }
        }
        while(l < r) {
            if(array[l] == sum - array[r]) {
                if(array[l] * array[r] < min) {
                    min =array[l] * array[r];
                    s1 = array[l];
                    s2 = array[r];
                }
                l++;
                r--;
                real = true;
            }
            else if(array[l] < sum - array[r]) {
                l++;
                continue;
            }
            else {
                r--;
            }
        }
        if(real){
            res.add(s1);
            res.add(s2);
        }
        return res;
    }
}
