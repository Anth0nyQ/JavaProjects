package com.company;

public class Queue
{
    private int size;
    private int[] elements;
    Queue()
    {
        elements = new int[8];
        size = 0;
    }

    public void enqueue(int v)
    {
        elements[size] = v;      /* assign v to elements[size] instead of elements[size+1] */
        size++;                              /* increment size by 1 after each enqueue operation */
        if (size >= elements.length)
        {
            int[] temp_array = elements;
            elements = new int[size*2];
            for (int i = 0; i<temp_array.length;i++)
            {
                elements[i] = temp_array[i];
            }
        }
    }

    public int dequeue()
    {
        int v = -1;
        if (empty() == true)
        {
            System.out.println("queue is empty");
        }
        else
        {
            v = elements[0];
            for(int i =0; i<elements.length-1; i++)
            {
                elements[i] = elements[i+1];
            }
            size = size - 1;
        }
        return v;
    }

    public boolean empty()
    {
        if (size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getSize()
    {
        return size;
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();
        for (int i = 0; i<20; i++){
            myQueue.enqueue(i);
        }

        for (int j = 0; j<20; j++){
            System.out.printf("%2d ", myQueue.dequeue());
            if ((j+1)%5 == 0){
                System.out.println();
            }
        }
    }
}
