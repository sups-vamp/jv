import java.util.Scanner;
class check
{
    public static void main(String arg[])
    {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        a=obj.nextInt();
        if(a%2==0)
        {
            System.out.print("number is even");     
        }
        else
        {
            System.out.print("number is odd");   
        }
    }
}
        