class StackLL<Item>
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

    public StackLL()
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

    public void push(Item item)
    {
        Node newNode = new Node(item);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
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

    public Item pop()
    {
        if (isEmpty())
        {
            System.out.println("No item can be popped");
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
        for (cur = head; cur != null;cur = cur.next)
        {
            sb.append(cur.item + "->");
        }
        sb.append("NULL");
        return sb.toString();
    }
}

public class StackLLImplementationTest 
{
    public static void main(String[] args)
    {
        StackLL<Integer> stack = new StackLL<>();
        System.out.println(stack.getSize());
        System.out.println(stack);
    }    
}
