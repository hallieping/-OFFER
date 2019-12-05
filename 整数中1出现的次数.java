public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
    int x=1;  // x可以为1-9任意数，该方法利用数学规律
    //           1-10中x在各位出现1次，1-100中十位出现10次，1-1000中百位出现100次
    if(n<0||x<1||x>9)
        return 0;
    int high,low,curr,tmp,i = 1;
    high = n;
    int total = 0;
    while(high!=0){
        high = n/(int)Math.pow(10, i);// 获取第i位的高位
        tmp = n%(int)Math.pow(10, i);
        curr = tmp/(int)Math.pow(10, i-1);// 获取第i位
        low = tmp%(int)Math.pow(10, i-1);// 获取第i位的低位
        if(curr==x){
            total+= high*(int)Math.pow(10, i-1)+low+1;
        }else if(curr<x){
            total+=high*(int)Math.pow(10, i-1);
        }else{
            total+=(high+1)*(int)Math.pow(10, i-1);
        }
        i++;
    }
    return total;       
    }
}

//另外：
//链接：https://www.nowcoder.com/questionTerminal/bd7f978302044eee894445e244c7eee6
//来源：牛客网

 int NumberOf1Between1AndN_Solution(int n)
    {
        int ones = 0;
        for (long long m = 1; m <= n; m *= 10) {
            int a = n/m, b = n%m;
            if(a%10 == 0)
                ones += a / 10 * m;
            else if(a%10 == 1) 
                ones += (a/10*m) + (b+1);
            else
                ones += (a/10+1)* m;
        }
        return ones;
    }

