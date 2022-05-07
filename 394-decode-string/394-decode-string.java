// help: https://www.youtube.com/watch?v=0iQqj5egK9k

class Solution {
    Stack<String> result = new Stack<>();
    Stack<Integer> counts = new Stack<>();
    public String decodeString(String s) {
        String cur = "";
        
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)){
                int num = 0;
                
                while(Character.isDigit(s.charAt(i))){
                    num = 10 * num + (s.charAt(i) - '0');
                    i++;
                }
                counts.push(num);
            }else if(ch == '['){
                result.push(cur);
                cur = "";
                i++;
            }else if(ch == ']'){
                int count = counts.pop();
                String res = result.pop();
                cur = makeMultiple(new StringBuilder(res), cur, count).toString();
                i++;
            }else{
                cur += ch;
                i++;
            }
        }
        return cur;
        
    }

    
    public StringBuilder makeMultiple(StringBuilder res, String str, int times){
        if(times == 0) return res;
        
        return makeMultiple(res.append(str), str, --times);
    }
}