///
///题目描述
//首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
///每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
///从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
///请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)

//第一次是 (m-1)%n ,之后每一次都在原来的索引基础上进行，所以加上原来的索引，由于是环而取余（可能m很大）

import java.util.LinkedList;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> loop = new LinkedList<>();
        for(int i=0; i<n; i++) {
            loop.add(i);
        }
        int k = 0;
        while(loop.size() > 1) {
            k = (k+m-1) % loop.size();
            loop.remove(k);
        }
        return loop.size() == 1? loop.get(0):-1;
    }
}
