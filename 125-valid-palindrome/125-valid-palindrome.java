class Solution {
    public boolean isPalindrome(String s) {
        String modified = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        for(int i = 0; i < modified.length()/2; i++){
            if(modified.charAt(i) != modified.charAt(modified.length() - i - 1))
                return false;
        }
        return true;
    }
}