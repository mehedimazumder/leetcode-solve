class LRUCache {
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> pageMap;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        pageMap = new HashMap(capacity);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int val = -1;
        Node node = pageMap.get(key);
        if(node != null){
            remove(node);
            add(node);
                val = node.val;
        }
        return val;
    }
    
    public void put(int key, int value) {
        Node node = pageMap.get(key);
        if(node != null){
            remove(node);
            node.val = value;
            add(node);
        }else{
            if(capacity == pageMap.size()){
                Node evicNode = tail.prev;
                pageMap.remove(evicNode.key);
                remove(evicNode);
            }
            Node newNode = new Node(key, value);
            pageMap.put(key, newNode);
            add(newNode);
        }
    }
    
    private void add(Node node){
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;
    }
    
    private void remove(Node node){
        Node next = node.next;
        Node prev = node.prev;
        
        prev.next = next;
        next.prev = prev;
    }
    
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int k, int v){
            this.key = k;
            this.val = v;
        }
        Node(){
            
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */