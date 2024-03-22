class SinglyLinkedList<Item>
{
    private class Node
    {
        private Item item;
        private Node next;

        public Node(Item item, Node next)
        {
            this.item = item;
            this.next = next;
        }

        public Node(Item item)
        {
            this.item = item;
            this.next = null;
        }

        public Node()
        {
            this.item = null;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public SinglyLinkedList()
    {
        this.head = null;
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
        newHead.next = this.head;
        this.head = newHead;
        this.size++;
    }

    public void add(Item item, int index)
    {
        if (index < 0 || index > size)
        {
            System.out.println("Index error");
            return;
        }

        Node cur = this.head;
        
        if (index == 0)
        {
            this.addFirst(item);
            return;
        }

        for (int i = 0; i < index;i++)
        {
            if (i == index - 1)
            {
                Node newNode = new Node(item);
                newNode.next = cur.next;
                cur.next = newNode;
                this.size++;
                return;
            }
            cur = cur.next;
        }
    }
    
    public void addLast(Item item)
    {
        this.add(item, size);
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

    public void removeFirst()
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return;
        }

        Node newHead = this.head.next;
        this.head = newHead;
        this.size--;
    }
    
    public void remove(int index)
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return;
        }

        if (index < 0 || index > size)
        {
            System.out.println("Index error");
        }

        if (index == 0)
        {
            this.removeFirst();
            return;
        }

        Node cur = this.head;
        for (int i = 0; i < index; i++)
        {
            if (i == index - 1)
            {
                cur.next = cur.next.next;
                this.size--;
                return;
            }
            cur = cur.next;
        }
    }

    public void removeLast()
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return;
        }
        
        this.remove(size - 1);
    }

    public void removeItem(Item item)
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return;
        }
        
        Node prev = this.head;
        Node cur = this.head.next;
        
        if (this.head.item.equals(item))
        {
            this.removeFirst();
            return;
        }
        
        for (cur = head.next; cur != null;cur = cur.next)
        {
            if (cur.item.equals(item))
            {
                prev.next = cur.next;
                this.size--;
                return;
            }
            prev = prev.next;
        }
        
        if (cur == null) 
        {
            System.out.println("No item can be deleted");
        }
    }

    public void setFirst(Item item)
    {
        this.head.item = item;
    }
    
    public void set(Item item, int index)
    {
        if (index < 0 || index >= size)
        {
            System.out.println("Index error");
        }

        if (index == 0)
        {
            this.head.item = item;
            return;
        }

        Node cur = this.head;
        
        for (int i = 0;i < index;i++)
        {
            cur = cur.next;
        }
        cur.item = item;
    }

    public void setLast(Item item)
    {
        Node cur = this.head;
        while (cur.next != null)
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
        }

        if (index == 0)
        {
            return this.head.item;
        }

        Node cur = this.head;
        for (int i = 0; i < index;i++)
        {
            cur = cur.next;
        }
        return cur.item;
    }

    public Item peekLast()
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return null;
        }


        Node cur = this.head;
        while (cur.next != null)
        {
            cur = cur.next;
        }
        return cur.item;
    }

    public int indexOf(Item item)
    {
        int index = 0;
        Node cur = this.head;
        for (cur = head;cur != null;cur = cur.next)
        {
            if (cur.item.equals(item))
            {
                break;
            }
            index++;
        }
        
        if (cur == null)
        {
            System.out.println("No such item can be found");
            return -1;
        }
        return index;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        Node cur = this.head;
        for (cur = head;cur != null;cur = cur.next)
        {
            sb.append(cur.item + "->");
        }
        sb.append("NULL");
        return sb.toString();
    }
}

public class SinglyLinkedListTest
{
    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        System.out.println(sll);
        System.out.println(sll.getSize());
    }
}