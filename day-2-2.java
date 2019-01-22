import java.util.Scanner;
class check
{
    public static void main(String arg[])
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number");
        a=obj.nextInt();
        System.out.println("enter second number");
        b=obj.nextInt();
        if(a>b)
        {
            System.out.print("greater number is : ");
            System.out.print(a);
        }
        else
        {
            System.out.print("greater number is : ");
            System.out.println(b);
        }
    }
}
        