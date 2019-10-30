//构建数组使得b[i] = a[] * a[]，即前面的乘积*后面的乘积，不包括a[i]
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B1 = new int[A.length];
        int[] B2 = new int[A.length];
        if(A.length == 0) return A;
        B1[0] = 1;
        B2[A.length-1] = 1;
        for(int i=1; i<A.length; i++)
            B1[i] = B1[i-1]*A[i-1];
        for(int i=A.length-2; i>=0; i--) {
            B2[i] = B2[i+1]*A[i+1];
        }
        int[] B = new int[A.length];
        for(int i=0; i< A.length; i++) {
            B[i] = B1[i]*B2[i];
        }
        return B;
    }
}
