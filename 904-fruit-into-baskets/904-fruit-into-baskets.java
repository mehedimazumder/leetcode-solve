class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> counts = new HashMap();
        
        int i = 0;
        int j = 0;
        
        int max = 0;
        while(j < fruits.length){
            int tree = fruits[j];
            // add to map
            counts.put(tree, counts.getOrDefault(tree, 0) + 1);
            // check if not valid; unq <= 2
                // then
                // remove untill any tree from map becomes 0
            
            while(counts.size() > 2){
                int extra = fruits[i++];
                counts.put(extra, counts.get(extra) - 1);
                if(counts.get(extra) == 0) counts.remove(extra);
            }
            
            // update max
            max=Math.max(max, j-i+1);
            
            j++;
        }
        return max;
    }
}