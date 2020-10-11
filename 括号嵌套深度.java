class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int left = 0;
        int tmpDepth = 0;
        for (char c:s.toCharArray()) {
            if (c == '(') {
                left++;
                tmpDepth = Math.max(left,tmpDepth);
            } else if (c == ')') {
                left--;
                if (left == 0) {
                    res = Math.max(res, tmpDepth);
                }
            }
        }
        return res;
    }
}
