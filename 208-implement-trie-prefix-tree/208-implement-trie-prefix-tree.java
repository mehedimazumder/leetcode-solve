class Trie {
    class TrieNode{
        char val;
        Map<Character, TrieNode> childrens = new HashMap<>();
        boolean isWord;
        TrieNode(char v){
            val = v;
        }
    }
    TrieNode head = null;
    public Trie() {
        head = new TrieNode('*');
    }
    
    public void insert(String word) {
        TrieNode curr = head;
        for(char ch : word.toCharArray()){
            TrieNode child = curr.childrens.get(ch);
            if(child == null){
                child = new TrieNode(ch);
                curr.childrens.put(ch, child);
            }
            curr = child;
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = head;
        for(char ch : word.toCharArray()){
            TrieNode child = curr.childrens.get(ch);
            if(child == null)
                return false;
            curr = child;
        }
        return curr.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = head;
        for(char ch : prefix.toCharArray()){
            TrieNode child = curr.childrens.get(ch);
            if(child == null)
                return false;
            curr = child;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */