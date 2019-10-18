import java .util.Arrays;
public class Solution {
    public String PrintMinNumber(int [] numbers) {
        int size = numbers.length;
        for(int i=0; i<size-1; i++) {
            for(int j=i+1; j<size; j++) {
                if(Integer.valueOf(numbers[i]+""+numbers[j]) > Integer.valueOf(numbers[j]+""+numbers[i])) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(int n :numbers) {
            res.append(String.valueOf(n));
        }
        return res.toString();
    }
}

//关键思想：1.比较ab 和 ba 的大小，自己设定排序方式
