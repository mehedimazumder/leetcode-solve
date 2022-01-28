class Solution {
    public boolean validPalindrome(String s) {
        int a_pointer = 0;
        int b_pointer = s.length() - 1;
        
        while(a_pointer <= b_pointer){
            if(s.charAt(a_pointer) != s.charAt(b_pointer)){
               return checkAfterDelete(new StringBuilder(s).deleteCharAt(a_pointer).toString()) || checkAfterDelete(new StringBuilder(s).deleteCharAt(b_pointer).toString());
            }
            a_pointer++;
            b_pointer--;
        }
        return true;
    }
    
    private boolean checkAfterDelete(String s){
        int a_pointer = 0;
        int b_pointer = s.length() - 1;
        
        while(a_pointer <= b_pointer){
            if(s.charAt(a_pointer) != s.charAt(b_pointer)){
                return false;
            }
            a_pointer++;
            b_pointer--;
        }
        return true;
    }
}