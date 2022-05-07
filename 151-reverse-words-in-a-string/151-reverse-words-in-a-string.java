class Solution {
    public String reverseWords(String s) {
        String res = "";
        int len = s.length();
        int i = 0;
        
        while(i < len){
            while(i < len && s.charAt(i) == ' ')
                i++;
            if(i >= len) break;
            int j = i + 1;
            while(j < len && s.charAt(j) != ' ') j++;
            String sub = s.substring(i, j);
            if(res.length() > 0) res = sub + " " + res;
            else res = sub;
            i = j+1;
        }
        return res;
    }
}