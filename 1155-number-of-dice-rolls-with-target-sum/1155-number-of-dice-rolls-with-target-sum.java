class Solution {
    int MOD = 1000000000 + 7;
    Map<String, Integer> memo = new HashMap<>();
    
    public int numRollsToTarget(int n, int k, int target) {
        return combinations(n, k, target);
    }
    
    public int combinations(int n, int k, int target){
        if(target == 0 && n == 0){
            return 1;
        }
        if (n == 0 || target == 0) {
            return 0;
        }
        
        String str = n + " " + target;
        if (memo.containsKey(str)) {
            return memo.get(str);
        }
        
        int count = 0;
        
        // for(int i = 1; i <= n; i++){
            for(int j = 1; j <= k && j <= target; j++){
                count = (count + combinations(n - 1, k, target - j)) % MOD;
            }    
        // }
        memo.put(str, count);
        return count;
    }
}