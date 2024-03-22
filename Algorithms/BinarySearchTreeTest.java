class BinarySearchTree
{
    private class Node
    {
        private int key;
        private Node left;
        private Node right;

        public Node(int key, Node left, Node right)
        {
            this.key = key;
            this.left = left;
            this.right = right;
        }

        public Node(int key)
        {
            this(key, null, null);
        }

        public Node()
        {
            this(0, null, null);
        }
    }

    private Node root = null;

    public boolean isEmpty()
    {
        return root == null;
    }

    public void insert(int key)
    {
        if (isEmpty())
        {
            this.root = new Node(key);
        }

        Node newNode = new Node(key);
        Node cur = this.root;

        while (cur != null)
        {
            if (key < cur.key)
            {

                if (cur.left == null)
                {
                    cur.left = newNode;
                }

                cur = cur.left;
            }

            if (key > cur.key)
            {
                if (cur.right == null)
                {
                    cur.right = newNode;
                }

                cur = cur.right;
            }

            if (key == cur.key)
            {
                return;
            }
        }

    }

    public Node get(int key)
    {
        Node cur = this.root;
        
        while (cur != null)
        {
            if (key == cur.key)
            {
                return cur;
            }
    
            else if (key < cur.key)
            {
                cur = cur.left;
            }
    
            else if (key > cur.key)
            {
                cur = cur.right;
            }
        }

        return null;
    }

    public void delete(int key)
    {
        Node parent = this.root;
        Node cur = this.root;

        while (cur != null)
        {
            if (key < cur.key)
            {
                parent = cur;
                cur = cur.left;
            }

            else if (key > cur.key)
            {
                parent = cur;
                cur = cur.right;
            }

            else if (key == cur.key)
            {
                if (cur.left == null && cur.right == null)
                {
                    if (cur == parent.left)
                    {
                        parent.left = null;
                        return;
                    }

                    else if (cur == parent.right)
                    {
                        parent.right = null;
                        return;
                    }
                }

                else if (cur.left != null && cur.right == null)
                {
                    Node leftchild = cur.left;
                    
                    if (cur == parent.left)
                    {
                        parent.left = leftchild;
                        cur.left = null;
                        return;
                    }

                    else if (cur == parent.right)
                    {
                        parent.right = leftchild;
                        cur.left = null;
                        return;
                    }
                }

                else if (cur.left == null && cur.right != null)
                {
                    Node rightchild = cur.right;

                    if (cur == parent.left)
                    {
                        parent.left = rightchild;
                        cur.right = null;
                        return;
                    }

                    else if (cur == parent.right)
                    {
                        parent.right = rightchild;
                        cur.right = null;
                        return;
                    }
                }

                else if (cur.left != null && cur.right != null)
                {
                    Node successor = cur.right;

                    if (cur == root)
                    {
                        if (successor.left == null)
                        {
                            successor.left = cur.left;
                            cur.left = null;
                            cur.right = null;
                            root = successor;
                            return;
                        }

                        else if (successor.left != null)
                        {
                            Node prevSuccessor = successor;
                            while (successor.left != null)
                            {
                                prevSuccessor = successor;
                                successor = successor.left;
                            }

                            if (successor.right == null)
                            {
                                successor.left = cur.left;
                                cur.left = null;
                                successor.right = cur.right;
                                cur.right = null;
                                prevSuccessor.left = null;
                                root = successor;
                                return;                            
                            }

                            else if (successor.right != null)
                            {
                                Node temp = successor.right;
                                successor.left = cur.left;
                                cur.left = null;
                                successor.right = cur.right;
                                cur.right = null;
                                prevSuccessor.left = temp;
                                root = successor;
                                return;
                            }
                        }
                    }

                    else if (cur != root)
                    {
                        if (cur == parent.left)
                        {
                            if (successor.left == null)
                            {
                                parent.left = successor;
                                successor.left = cur.left;
                                cur.left = null;
                                cur.right = null;
                                return;
                            }

                            else if (successor.left != null)
                            {
                                Node prevSuccessor = successor;
                                while (successor.left != null)
                                {
                                    prevSuccessor = successor;
                                    successor = successor.left;
                                }   

                                if (successor.right == null)
                                {
                                    parent.left = successor;
                                    successor.left = cur.left;
                                    cur.left = null;
                                    successor.right = cur.right;
                                    cur.right = null;
                                    prevSuccessor.left = null;
                                    return;
                                }

                                else if (successor.right != null)
                                {
                                    Node temp = successor.right;
                                    parent.left = successor;
                                    successor.left = cur.left;
                                    cur.left = null;
                                    successor.right = cur.right;
                                    cur.right = null;
                                    prevSuccessor.left = temp;
                                    return;
                                }
                            }
                        }

                        else if (cur == parent.right)
                        {
                            if (successor.left == null)
                            {
                                parent.right = successor;
                                successor.left = cur.left;
                                cur.left = null;
                                cur.right = null;
                                return;
                            }

                            else if (successor.left != null)
                            {
                                Node prevSuccessor = successor;
                                while (successor.left != null)
                                {
                                    prevSuccessor = successor;
                                    successor = successor.left;
                                }

                                if (successor.right == null)
                                {
                                    parent.right = successor;
                                    successor.left = cur.left;
                                    cur.left = null;
                                    successor.right = cur.right;
                                    cur.right = null;
                                    prevSuccessor.left = null;
                                    return;
                                }

                                else if (successor.right != null)
                                {
                                    Node temp = successor.right;
                                    parent.right = successor;
                                    successor.left = cur.left;
                                    cur.left = null;
                                    successor.right = cur.right;
                                    cur.right = null;
                                    prevSuccessor.left = temp;
                                    return;
                                }
                            }
                        }
                    }  
                }
            }

            if (cur == null)
            {
                System.out.println("No such tree node can be deleted");
            }
        }
    }

    public Node peek()
    {
        return this.root;
    }

    public void preorder(Node root)
    {
        if (isEmpty())
        {
            System.out.println("No elements");
        }

        Node cur = root;

        if (cur == null)
        {
            return;
        }

        System.out.print(cur.key + " ");
        preorder(cur.left);
        preorder(cur.right);
    }
    
    public void inorder(Node root)
    {
        if (isEmpty())
        {
            System.out.println("No elements");
        }

        Node cur = root;
        
        if (cur == null)
        {
            return;
        }

        inorder(cur.left);
        System.out.print(cur.key + " ");
        inorder(cur.right);
    }

    public void postorder(Node root)
    {
        if (isEmpty())
        {
            System.out.println("No elements");
        }

        Node cur = root;
        
        if (cur == null)
        {
            return;
        }

        postorder(cur.left);
        postorder(cur.right);
        System.out.print(cur.key + " ");
    }
}

public class BinarySearchTreeTest 
{
    public static void main(String[] args)
    {
        BinarySearchTree BST = new BinarySearchTree();
    }
}
