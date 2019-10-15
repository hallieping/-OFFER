public boolean duplicate(int numbers[],int length,int [] duplication) {
        int[] cnt = new int [length];
        for(int i=0; i<length; i++) {
            cnt[numbers[i]]++;
            if(cnt[numbers[i]] > 1) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
}
