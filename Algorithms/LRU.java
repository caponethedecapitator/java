import java.util.*;

public class LRU {
    class LinkedHashMap{
        class Node{
            private int key;
            private int value;
            private Node prev;
            private Node next;
            
            public Node(){}
    
            public Node(int key, int value){
                this.key = key;
                this.value = value;
            }
    
            public Node(int key, int value, Node prev, Node next){
                this.key = key;
                this.value = value;
                this.prev = prev;
                this.next = next;
            }
        }
    
        private int size;
        private int capacity;
        private Map<Integer, Node> pair = new HashMap<>();
        private Node head = new Node();
        private Node tail = new Node();

        public LinkedHashMap(int capacity){
            this.size = 0;
            this.capacity = capacity;
            head.next = tail;
            tail.prev = head;
        }


        public void addToHead(Node node){
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        public void remove(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        
        public Node removeTail(){
            Node cur = tail.prev;
            tail.prev = cur.prev;
            cur.prev.next = tail;
            return cur;
        }

        public void moveToHead(Node node){
            remove(node);
            addToHead(node);
        }
        
        public int get(int key){
            Node node = pair.get(key);
            if (node == null){
                return -1;
            }
            moveToHead(node);
            return node.value;
        }
        
        public void put(int key, int value){
            Node node = pair.get(key);
            if (node == null){
                Node newNode = new Node(key, value);
                pair.put(key, newNode);
                if (size < capacity){
                    addToHead(newNode);
                    size++;
                }
                else{
                    Node cur = removeTail();
                    pair.remove(cur.key);
                    addToHead(newNode);
                }
            }
            else{
                node.value = value;
                moveToHead(node);
            }

        }
    }
}
