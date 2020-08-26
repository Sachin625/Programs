import java.util.*;
class linear_search
{
    String str1,key;
    Scanner scan = new Scanner(System.in);
    void read()
    {
        System.out.println("Enter a string");
        str1=scan.nextLine();
        
    }
    void l_search()
    {
        System.out.println("Enter a  char to be searched");
        key=scan.nextLine();
        for(int i = 0;i<str1.length();i++)
        {
            if(key==str1(i))
            {
                System.out.println("The character is found at" +(i+1));
            }
            else System.out.println("The character is not found");
        }
    }
    public static void main(final String args[])
        {
            final linear_search obj = new linear_search();
            obj.read();
            obj.l_search();
        }
}