class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {    
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            String s = new String(cArr);
            
            if(map.containsKey(s)){
				map.get(s).add(strs[i]);
			}else {
				List<String> list = new ArrayList();
				list.add(strs[i]);
				map.put(s, list);
			}
        }
        return new ArrayList(map.values());
    }
}