import java.util.*;
class conditional
{
    public static void main(String arg[])
    {
        display();
    }

static void display()
{
    System.out.println("Enter a number");
        Scanner obj=new Scanner(System.in);
        int a,i;
        a=obj.nextInt();
        for(i=1;i<=a;i++)
        {
            System.out.println(i);
        }
}

}