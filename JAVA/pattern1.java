import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=scan.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++)
       {
            for(j=1;j<=i;j++)
            {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    
    }
}