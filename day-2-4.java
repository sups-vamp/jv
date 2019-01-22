import java.util.Scanner;
class check
{
    public static void main(String arg[])
    {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number");
        a=obj.nextInt();
        System.out.println("enter second number");
        b=obj.nextInt();
        c=a+b;
        if(c%2==0)
        {
            System.out.print("sum is even.");
        }
        else
        {
           System.out.print("sum is odd.");
        }
    }
}
        