class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int i = 0;
        int n = chars.length;
        
        while(i < n){
            int j = Math.min(n - 1, i + k -1);
            swap(chars, i, j);
            i += 2 * k;
        }
        return new String(chars);
    }
    
    public void swap(char[] chars, int l, int r){
        while(l<r){
            char tmp = chars[l];
            chars[l++] = chars[r];
            chars[r--] = tmp;
        }
    }
}