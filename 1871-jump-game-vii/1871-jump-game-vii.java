class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        // https://www.youtube.com/watch?v=v1HpZUnQ4Yo
        
        Queue<Integer> tracks = new ArrayDeque<>();
        tracks.add(0);
        int farthest = 0;
        
        while(tracks.size() != 0){
            int idx = tracks.remove();
            int start = Math.max(farthest + 1, idx+minJump);
            int end = Math.min(s.length() - 1, idx+maxJump);
            
            for(int i = start; i <= end; i++){
                if(s.charAt(i) == '0'){
                    if(i == s.length() - 1)
                        return true;
                    
                    tracks.add(i);                    
                }
            }
            farthest = idx+maxJump;
        }
        return false;
    }
}