abstract class stack_abstract{
    abstract void push(int element);
    abstract void pop();
    abstract boolean isEmpty();
}
abstract class queue_abstract{
    abstract void insertRear(int element);
    abstract void deleteFront();
    abstract boolean isEmpty();
}

class stack extends stack_abstract
{
    int ele[] = new int[20];
    int top = -1;
    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    void push(int element)
    {
        if(top == ele.length-1)
        {
            System.out.println("stack overflow");
        }
        ele[++top]=element;
    }
    void pop()
    {
        if(this.isEmpty()==true)
        {
            System.out.println("stack empty cannot delete");
        }
        top--;
    }
    void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(ele[i]);
        }
    }
}
class queue extends queue_abstract
{
    int ele[] = new int[20];
    int rear = -1 ;
    int front = 0;
    boolean isEmpty()
    {
        if(front == rear)
        {
            return true;
        }
        return false;
    }
    void insertRear(int element)
    {
        ele[++rear] = element;
    }
    void deleteFront()
    {
        if(this.isEmpty() == true)
        {
            System.out.println("queue underflow");
        }
        front++;
    }
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(ele[i]);
        }
    }
}

public class stack_queue_abstract {
    public static void main(String args[])
    {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
        queue q = new queue();
        q.insertRear(1);
        q.insertRear(2);
        q.insertRear(3);
        q.display();
        q.deleteFront();
        q.display();

    }
}