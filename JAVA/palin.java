import java.util.*;
class palin
{
    String str1,str2="";
    void palindrome()
    {
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        str1=scan.nextLine();
        for(int i = str1.length() - 1; i >= 0; i--)
        {
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2))
        {
            System.out.println("The string is palindrome");
        }
        else
        System.out.println("The string is not palindrome");
    }
    public static void main(String args[])
    {
        palin obj = new palin();
        obj.palindrome();
    }
   
}