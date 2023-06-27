import java.util.*;
class Queue
{
    int arr[]=new int[20];
    int f,r,i,v,size;
    Queue(int nn)
    {
        for(i=0;i<20;i++)
        {
            arr[i]=0;
        }
        f=-1;r=-1;
        size=nn;
    }
    void push(int val)
    {
        if(r==size-1)
        {
            System.out.println("Queue overflow");
        }
        else
        {
            if(f==-1&&r==-1)
            {
                f=0;r=0;
            }
            else
            {
                r=r+1;
            }
            arr[r]=val;
            System.out.println("The new value is"+ arr[r]);
        }
    }
    void pop()
    {
        if(f==-1&&r==-1)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            int v=arr[f];
            System.out.println("The popped value is"+v);
            if(f==r)
            {
                f=-1;r=-1;
            }
            else
            {
                f=f+1;
            }
        }
    }
    void display()
    {
        if(f==-1&&r==-1)
        {
            System.out.println("No value to display");
        }
        else
        {
            for(i=f;i<=r;i++)
            {
                System.out.print(arr[i]+",");
            }
            System.out.println();
        }
    }
    public static void main()// main method to call all the member functions 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Queue program");
        System.out.println("____________________________");
        System.out.println("Enter any Queue size below 10");
        int size=in.nextInt();
        Queue obj=new Queue(size);
        while(true)
        {
            System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.STOP\nENTER YOUR CHOICE");
            int ch=in.nextInt();
            switch(ch)
            {
                case 1: 
                System.out.println("Enter the element");
                int ele=in.nextInt();
                obj.push(ele);
                break;
                case 2:
                obj.pop();
                break;
                case 3:
                obj.display();
                break;
                case 4:
                System.out.println("_______________________________");
                System.out.println("Thank You");
                System.exit(1);
            }
        }
    }
}
