

“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，
方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，
喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？

// 思路：递归或者数学：3瓶换一瓶喝 = 2瓶喝一次
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();
        while(sc.hasNext()) {
            int num = sc.nextInt();
            if(num == 0) break;
            res.add(drinkPlay3(num));

        }
         
       
        for(int i=0; i<res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    private static int drinkPlay3(int n) {
        if(n < 2) return 0;
        if(n == 2 || n == 3) return 1;
        return 1 + drinkPlay3(n-2);
        
        // return n/2;
    }
    
}
