//归并排序解决
public class Solution {
    public int InversePairs(int [] array) {
        if(array.length <= 1) return 0;
        
        
        return merge(array,0,array.length-1);
    }
    public int merge(int[] a, int l, int r) {
        if(l == r) return 0;
        int mid = (l+r)/2;
        int lcount = merge(a,l,mid)%1000000007;
        int rcount = merge(a,mid+1,r)%1000000007;
        int il = l;
        int ir = mid+1;
        int i = 0, cnt = 0;
        int[] tmp =new int[r-l+1];
        while(il <= mid && ir <= r) {
            if(a[il] > a[ir]) {
                cnt += mid-il+1;
                cnt = cnt %1000000007;
                tmp[i++] = a[ir++];
            }
            else {
                tmp[i++] = a[il++];
            }
        }
        while(il<=mid) {
            tmp[i++] = a[il++];
        }
        while(ir<=r) {
            tmp[i++] = a[ir++];
        }
        i=0;
        while(i<tmp.length) {
            a[l+i] = tmp[i];
            i++;
        }
        return (lcount + rcount + cnt)%1000000007;
    }
}
