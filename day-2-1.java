import java.util.*;
class check
{
    public static void main(String arg[])
    {
        int a;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        if(a==0)
        {
            System.out.println("number is zero.");
        }
        else if(a>0)
        {
            System.out.println("number is positive.");
        }
        else
        {
            System.out.println("number is negative.");
        }
    }
}
