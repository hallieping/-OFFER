import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int l=0, u=0;
        int r=matrix[0].length; 
        int d=matrix.length;
        int cnt = r * d;
        r--;
        d--;
        ArrayList<Integer> listp = new ArrayList<>();
        for(int i=0,j=0; cnt>0; cnt--){
            listp.add(matrix[i][j]);
            if(i == u) {
                if(j < r)
                    j++;
                else if(j == r)
                    i++;
                continue;
            }
            if(j == r) {
                if(i < d)
                    i++;
                else if(i == d)
                    j--;
                continue;
            }
            if(i == d) {
                if(j > l)
                    j--;
                else if (j == l)
                    i--;
                
                continue;
            }
            if(j == l) {
                if(i > u+1)
                    i--;
                else if(i == u+1){
                    j++;
                    u++;
                    d--;
                    l++;
                    r--;
                    continue;
                }
                
            }
            
        }
        return listp;
    }
}
