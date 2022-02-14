class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.offerFirst(c);
            }else{
                if(stack.size() == 0)
                    return false;
                
                char top = stack.peekFirst();
                if(top == '(' && c == ')' || top == '{' && c == '}' || top == '[' && c == ']')
                    stack.pollFirst();
                else
                    return false;
            }
        }
        if(stack.size() == 0)
            return true;
        
        return false;
    }
}