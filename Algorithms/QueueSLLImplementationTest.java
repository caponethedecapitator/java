class QueueSLL<Item>
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

    public QueueSLL()
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

    public void enqueue(Item item)
    {
        Node newNode = new Node(item);
        if (isEmpty())
        {
            this.head = newNode;
            this.size++;
        }

        else
        {
            Node cur = this.head;
            for (cur = head; cur != null;cur = cur.next)
            {
                if (cur.next == null)
                {
                    cur.next = newNode;
                    newNode.next = null;
                    this.size++;
                    return;
                }
            }
        }
    }

    public Item peek()
    {
        if (isEmpty())
        {
            System.out.println("No item");
            return null;
        }
        
        return this.head.item;
    }

    public Item dequeue()
    {
        if (isEmpty())
        {
            System.out.println("No item can be dequeued");
            return null;
        }

        Item delItem;
        delItem = this.head.item;
        this.head = this.head.next;
        this.size--;
        return delItem;
    } 

    @Override
    public String toString()
    {
        Node cur = this.head;
        StringBuilder sb = new StringBuilder();
        for (cur = head;cur != null;cur = cur.next)
        {
            sb.append(cur.item + "->");
        }
        sb.append("NULL");
        return sb.toString();
    }
}

public class QueueSLLImplementationTest
{
    public static void main(String[] args)
    {
        QueueSLL<Integer> queue = new QueueSLL<>();
        System.out.println(queue.getSize());
        System.out.println(queue);
    }    
}
