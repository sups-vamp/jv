import java.util.*;
class my_switch
{
    public static void main(String arg[])
    {
        int a,b,c,ch;
        System.out.println("enter choice");
        Scanner obj=new Scanner(System.in);
        ch=obj.nextInt();
        System.out.println("enter number 1");
        a=obj.nextInt();
        System.out.println("enter number 2");
        b=obj.nextInt();
        switch(ch)
        {
            case 1:
            c=a+b;
            System.out.println(c);
            break;

            case 2:
            c=a-b;
            System.out.println(c);
            break;
        }
    }
    
}