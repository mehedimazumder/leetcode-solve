class Solution {
    public String minWindow(String s, String t) {
        // https://www.youtube.com/watch?v=jSto0O4AJbM
        if(t == "") return "";
        
        Map<Character, Integer> tCount = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        
        for(char c: t.toCharArray()){
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }
        
        int have = 0, need = tCount.size();
        
        int[] res = new int[2];
        int resLen = Integer.MAX_VALUE;
        int l = 0;
        
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            if(tCount.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(tCount.get(c))){
                    have++;
                }
            }
                
            while(have == need){
                if(r - l + 1 < resLen){
                    res[0] = l;
                    res[1] = r;
                    resLen = r - l + 1;
                }
                if(tCount.containsKey(s.charAt(l))){
                    window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                    if(window.get(s.charAt(l)) < tCount.get(s.charAt(l)))
                        have--;
                }
                
                l++;
            }
            
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
        
    }
}