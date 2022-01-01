class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] charFlag = new boolean[26];
        
        for(int i = 0; i < sentence.length(); i++){
            if(charFlag[((int)sentence.charAt(i) % 97)] == true)
                continue;
            charFlag[((int)sentence.charAt(i) % 97)] = true;
        }
        for(boolean flag:charFlag){
            if(!flag)
                return false;
        }
        return true;
    }
}