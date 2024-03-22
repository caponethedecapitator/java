class MaximumBinaryHeap
{
    private int maxSize;
    private int[] maxBinHeap;

    public MaximumBinaryHeap(int maxSize)
    {
        this.maxSize = maxSize;
        this.maxBinHeap = new int[this.maxSize];
        this.maxBinHeap[0] = 0; // maxBinHeap[0] denotes the size of binary heap
    }

    public boolean isEmpty()
    {
        return this.maxBinHeap[0] == 0;
    }

    public int getSize()
    {
        return this.maxBinHeap[0];
    }

    public int getParent(int cur)
    {
        return cur / 2;
    }

    public int getLeftChild(int cur)
    {
        return 2 * cur;
    }

    public int getRightChild(int cur)
    {
        return 2 * cur + 1;
    }

    
    public void insert(int val)
    {
        
        if (isEmpty())
        {
            maxBinHeap[1] = val;
            maxBinHeap[0]++;
            return;
        }

        if (maxBinHeap[0] == this.maxSize - 1)
        {
            System.out.println("Capacity Exceeded.");
            return;
        }
        
        for (int i = 1; i <= maxBinHeap[0]; i++)
        {
            if (val == maxBinHeap[i])
            {
                return;
            }
        }

        maxBinHeap[0]++;
        maxBinHeap[maxBinHeap[0]] = val;
        
        int cur = maxBinHeap[0];
        
        while (maxBinHeap[cur] > maxBinHeap[getParent(cur)])
        {
            if (cur == 1)
            {
                break;
            }

            swap(cur, getParent(cur));
            cur = getParent(cur);
        }    
    }
    

    public void swap(int index_1, int index_2)
    {
        int temp;
        temp = maxBinHeap[index_1];
        maxBinHeap[index_1] = maxBinHeap[index_2];
        maxBinHeap[index_2] = temp;
    }

    public int extractMax()
    {
        int poppedElement = maxBinHeap[1];
        maxBinHeap[1] = maxBinHeap[maxBinHeap[0]];
        maxBinHeap[0]--;

        int cur = 1;
        while (cur < (maxBinHeap[0] / 2) + 1)
        {
            if (getRightChild(cur) > maxBinHeap[0])
            {
                if (maxBinHeap[cur] < maxBinHeap[getLeftChild(cur)])
                {
                    swap(cur, getLeftChild(cur));
                    cur = getLeftChild(cur);
                }

                else if (maxBinHeap[cur] > maxBinHeap[getLeftChild(cur)])
                {
                    break;
                }
            }

            else if (getRightChild(cur) <= maxBinHeap[0])
            {
                if (maxBinHeap[cur] > maxBinHeap[getLeftChild(cur)] && maxBinHeap[cur] > maxBinHeap[getRightChild(cur)])
                {
                    break;
                }
    
                else if (maxBinHeap[cur] < maxBinHeap[getLeftChild(cur)] && maxBinHeap[cur] > maxBinHeap[getRightChild(cur)])
                {
                    swap(cur, getLeftChild(cur));
                    cur = getLeftChild(cur);
                }
    
                else if (maxBinHeap[cur] > maxBinHeap[getLeftChild(cur)] && maxBinHeap[cur] < maxBinHeap[getRightChild(cur)])
                {
                    swap(cur, getRightChild(cur));
                    cur = getRightChild(cur);
                }
    
                else if (maxBinHeap[cur] < maxBinHeap[getLeftChild(cur)] && maxBinHeap[cur] < maxBinHeap[getRightChild(cur)])
                {
                    if (maxBinHeap[getLeftChild(cur)] < maxBinHeap[getRightChild(cur)])
                    {
                        swap(cur, getRightChild(cur));
                        cur = getRightChild(cur);
                    }
    
                    else if (maxBinHeap[getLeftChild(cur)] > maxBinHeap[getRightChild(cur)])
                    {
                        swap(cur, getLeftChild(cur));
                        cur = getLeftChild(cur);
                    }
                }
            }
        }

        return poppedElement;
    }
    
    public void heapSort()
    {
        for (int i = maxBinHeap[0]; i > 0; i--)
        {
            System.out.print(extractMax() + " ");
        }
        System.out.println();
    }

    public void traversal()
    {
        for (int i = 1; i <= maxBinHeap[0]; i++)
        {
            System.out.print(maxBinHeap[i] + " ");
        }
        System.out.println();
    }
}

public class BinaryHeapTest 
{
    public static void main(String args[])
    {
        MaximumBinaryHeap heap = new MaximumBinaryHeap(15);
        heap.insert(5);
        heap.insert(4);
        heap.insert(6);
        heap.insert(12);
        heap.insert(3);
        heap.insert(8);
        heap.insert(7);
        heap.insert(15);
        heap.insert(20);
        heap.insert(2);
        heap.insert(13);
        heap.traversal();
        heap.heapSort();
        System.out.println(heap.getSize());
    }    
}
