class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        final List<Integer> mismatches = new ArrayList<>();
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) 
                mismatches.add(i);
            if (mismatches.size() > 2) return false;
        }
        
        return mismatches.size() == 0 || (mismatches.size() == 2
            && s1.charAt(mismatches.get(0)) == s2.charAt(mismatches.get(1)) 
            && s2.charAt(mismatches.get(0)) == s1.charAt(mismatches.get(1)));                                                    
    }
}