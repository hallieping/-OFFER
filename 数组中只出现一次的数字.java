////有两个都只出现一次，其他都出现2次

import java.util.LinkedHashMap;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap();
        for(int i = 0; i < array.length; i++){
            if(!map.containsKey(array[i]))
                map.put(array[i], 1);
            else{
                map.put(array[i], 2);
            }
        }
        int i=0;
        for(i = 0; i < array.length; i++){
            if(map.get(array[i]) == 1) {
                num1[0] = array[i];
                break;
            }
            
        }
        for(i++; i < array.length; i++){
            if(map.get(array[i]) == 1) {
                num2[0]= array[i];
                break;
            }
        }
     
    }
}

/////////////有一个只出现一次，其他都出现2次时用异或最简单
