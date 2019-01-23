import java.util.*;
class add
{
    public static void main(String arg[])
    {
        int []x;int[]y;
        int size;
        Scanner obj=new Scanner(System.in);
        x=new int[5];
        y=new int[5];
        int i;
        for(i=0;i<5;i++)
        {
            x[i]=obj.nextInt();
        }
        for(i=0;i<5;i++)
        {
            y[i]=obj.nextInt();
        }
        for(i=0;i<5;i++)
        {
            System.out.println(x[i]+y[i]);
        }
    }    
}
