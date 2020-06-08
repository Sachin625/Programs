import java.util.*;
class flagsgame
{    
    public static void main(String args[])
    {
        int flag = 21;
        int user;
        int counter = 1;
        System.out.println("------------wekcome to the flage game------------------");
        while(flag!=0)
        {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your number of flags you want to remove");
            user = scan.nextInt();
            if(user==1 || user== 2)
            {
                 flag = flag-user;
                 counter++;
                 System.out.println("Remaining flags: "+flag);
             }
            else
            {
                 System.out.println("Move invalid");
                 continue;
            }
            if(flag == 0)
            {
                if(counter%2==0){
                    System.out.println("User 1 wins");
                }
                else{
                    System.out.println("User 2 wins");
                }
            }
        }

    }
}






