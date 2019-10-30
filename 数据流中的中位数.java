import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }


    public Double GetMedian() {
        Collections.sort(list);
        int n = list.size();
        if ((n & 1) == 1) {
            return Double.valueOf(list.get(n / 2));
        } else {
            return (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        }
    }
}
