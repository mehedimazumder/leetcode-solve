class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window technique
        int i = 0;
        int j = 0;
        
        List<Character> existingChars = new ArrayList<>();
        int maxCount = 0;
        while(j < s.length()){
            boolean isExist = existingChars.contains((Character)s.charAt(j));
            
            if(!isExist){
                existingChars.add(s.charAt(j));
                maxCount = Math.max(maxCount, existingChars.size());
                j++;
            }else{
               existingChars.remove((Character)s.charAt(i));
                i++;
            }
        }
        return maxCount;
    }
    
    // O(N)
     public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int i = 0;
        int j = 0;
        
        int maxSub = 0;
        while(j < s.length()){
            Integer repeatedCharIdx = map.get(s.charAt(j));
            
            if(repeatedCharIdx == null || (i >= repeatedCharIdx && j <= repeatedCharIdx)){
                map.put(Character.valueOf(s.charAt(j)), j);
                maxSub = Math.max(maxSub, j -i + 1);
            }else{
                i = repeatedCharIdx + 1;
            }
            j++;
        }
        return maxSub;
    }
}
