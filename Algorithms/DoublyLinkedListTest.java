class DoublyLinkedList<Item>
{
    private class Node
    {
        private Item item;
        private Node next;
        private Node prev;

        public Node(Item item, Node next, Node prev)
        {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public Node(Item item)
        {
            this.item = item;
            this.next = null;
            this.prev = null;
        }

        public Node()
        {
            this.item = null;
            this.next = null;
            this.prev = null;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return this.size == 0;
    }

    public void addFirst(Item item)
    {
        Node newHead = new Node(item);
        
        if (isEmpty())
        {
            this.head = newHead;
            this.tail = this.head;
            this.size++;
            return;
        }

        newHead.next = this.head;
        this.head.prev = newHead;
        this.head = newHead;
        this.size++;
    }

    public void addLast(Item item)
    {
        Node newTail = new Node(item);

        if (isEmpty())
        {
            this.tail = newTail;
            this.head = this.tail;
            this.size++;
            return;
        }

        newTail.prev = this.tail;
        this.tail.next = newTail;
        this.tail = newTail;
        this.size++;
    }

    public void add(Item item, int index)
    {
        if (index < 0 || index > size)
        {
            System.out.println("Index error");
        }

        if (index == 0)
        {
            this.addFirst(item);
            return;
        }

        if (index == size)
        {
            this.addLast(item);
            return;
        }

        Node newNode = new Node(item);
        Node cur = this.head;
        for (int i = 0; i < index;i++)
        {
            if (i == index - 1)
            {
                newNode.next = cur.next;
                cur.next.prev = newNode;
                cur.next = newNode;
                newNode.prev = cur;
                this.size++;
                return; 
            }
            cur = cur.next;
        }
    }

    public boolean contains(Item item)
    {
        Node cur = this.head;
        for (cur = head;cur != null;cur = cur.next)
        {
            if (cur.item.equals(item))
            {
                return true;
            }
        }
        return false;
    }
    
    public void setFirst(Item item)
    {
        this.head.item = item;
    }

    public void setLast(Item item)
    {
        this.tail.item = item;
    }
    
    public void set(Item item, int index)
    {
        if (index < 0 || index >= size)
        {
            System.out.println("Index error");
        }

        if (index == 0)
        {
            this.setFirst(item);
            return;
        }

        if (index == size - 1)
        {
            this.setLast(item);
            return;
        }

        Node cur = this.head;
        for (int i = 0;i < index;i++)
        {
            cur = cur.next;
        }
        cur.item = item;
    }

    public Item peekFirst()
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return null;
        }
        
        return this.head.item;
    }

    public Item peekLast()
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return null;
        }

        return this.tail.item;
    }

    public Item get(int index)
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return null;
        }

        if (index < 0 || index >= size)
        {
            System.out.println("Index error");
            return null;
        }

        if (index == 0)
        {
            this.peekFirst();
        }

        if (index == size - 1)
        {
            this.peekLast();
        }
        
        Node cur = this.head;
        for (int i = 0; i < index;i++)
        {
            cur = cur.next;
        }
        return cur.item;
    }

    public void removeFirst()
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return;
        }

        if (this.size == 1)
        {
            this.head = null;
            this.size--;
            return;
        }
        
        this.head = this.head.next;
        this.head.prev = null;
        this.size--;
    }

    public void removeLast()
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return;
        }

        if (this.size == 1)
        {
            this.tail = null;
            this.size--;
            return;
        }
        
        this.tail = this.tail.prev;
        this.tail.next = null;
        this.size--;
    }

    public void remove(int index)
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return;
        }
        
        if (index < 0 || index >= size)
        {
            System.out.println("Index error");
        }

        if (index == 0)
        {
            this.removeFirst();
            return;
        }

        if (index == size - 1)
        {
            this.removeLast();
            return;
        }

        Node cur = this.head;
        for (int i = 0;i <= index;i++)
        {
            if (i == index)
            {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                cur.next = null;
                cur.prev = null;
                this.size--;
                return;
            }
            cur = cur.next;
        }
    }
    
    public void removeItem(Item item)
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return;
        }
        
        Node cur = this.head;
        
        if (head.item.equals(item))
        {
            this.removeFirst();
            return;
        }

        if (tail.item.equals(item))
        {
            this.removeLast();
            return;
        }
        
        for (cur = head;cur != null;cur = cur.next)
        {
            if (cur.item.equals(item))
            {
                cur.prev.next = cur.next;
                cur.next = null;
                this.size--;
                return;
            }
        }
        
        if (cur == null)
        {
            System.out.println("No such item can be deleted");
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node cur = this.head;
        if (isEmpty())
        {
            sb.append("NULL");
            return sb.toString();
        }
        
        sb.append("NULL<-");
        while (cur != null)
        {
            if (cur.next == null)
            {
                sb.append(cur.item + "->");
                break;
            }
            
            sb.append(cur.item + "<->");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}

public class DoublyLinkedListTest 
{
    public static void main(String[] args)
    {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        System.out.println(dll.getSize());
        System.out.println(dll);
    }
}
