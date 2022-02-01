class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String st : strArr){
            sb.append(reverse(st) + " ");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
    
    private String reverse(String s){
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}