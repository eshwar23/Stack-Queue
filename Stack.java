import java.io.*;
public class Stack
{
  int s[]=new int [10];
  int sp;
  int i,n;
  Stack(int nn)// constructor
  {
      sp=-1;n=nn;
      for(i=0;i<10;i++)
      s[i]=0;
  }
  void push(int num)// function to push the value in the stack
  {
      if(sp==n-1)
      System.out.println("overflow");
      else
      {
          sp=sp+1;
          s[sp]=num;
          System.out.println("The new pushed value is-->"+s[sp]);
      }
    }
    void pop()// function to pop the value from the stack 
    {
      if(n==-1)
      System.out.println("underflow");
      else
      {
          int v;
          v=s[sp];
          System.out.println("The new deleted value is-->"+v);
          sp=sp-1;
       }
    }
    void display()// function to display the value of the stack
    {
        if(n==-1)
        System.out.println("No values present");
        else
        {
            System.out.println("The values present are");
            for(i=sp;i>=0;i--)
            System.out.print(s[i]+",");
        }
    }
// IT IS NOT NECESSARY TO WRITE THE MAIN FUNCTION FOR THE PROGRAM
//________________________________________________________________
    public void main()throws IOException// main method to call all the member functions 
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Welcome to the stack program");
        System.out.println("____________________________");
        System.out.println("Enter any stack size below 10");
        int size=Integer.parseInt(in.readLine());
        Stack obj=new Stack(size);
        while(true)
        {
            System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.STOP\nENTER YOUR CHOICE");
            int ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1: 
                System.out.println("Enter the element");
                int ele=Integer.parseInt(in.readLine());
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
                
                
                
                
            
            
            
        
        
          
  
