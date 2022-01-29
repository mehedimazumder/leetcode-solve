class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        for(List<String> item : items){
            if(ruleKey.equals("type")){
                if(item.get(0).equals(ruleValue))
                    matches++;
            }else if(ruleKey.equals("color")){
                if(item.get(1).equals(ruleValue))
                    matches++;
            }else{
                if(item.get(2).equals(ruleValue))
                    matches++;
            }
        }
        return matches;
    }
}