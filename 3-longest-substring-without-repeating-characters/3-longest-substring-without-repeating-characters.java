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
                maxCount = Math.max(maxCount, existingChars.size()+1);
                existingChars.add(s.charAt(j));
                j++;
            }else{
               existingChars.remove((Character)s.charAt(i));
                i++;
            }
        }
        return maxCount;
    }
}