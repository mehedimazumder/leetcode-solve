import java.util.regex.*;  
class Solution {
    public String validIPAddress(String queryIP) {
        String IPv4 = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        
        String IPv6 = "((([0-9a-fA-F]){1,4}\\:){7}(([0-9a-fA-F]){1,4}))";
        
        if(Pattern.matches(IPv4, queryIP))
            return "IPv4";
        else if(Pattern.matches(IPv6, queryIP))
            return "IPv6";
        else 
            return "Neither";
    }
}