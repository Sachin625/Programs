import java.util.*;

class flagsgame
{    
    int counter = 1;
    int flag = 21;
    void user_move(int move, int count) {
        boolean answer = true;
        while (answer != false)
            if (move == 1 || move == 2) {
                flag = flag - move;
                counter++;
                System.out.println("Remaining flags: " + flag);
                answer = false;
            } else {
                System.out.println("Move invalid");
                break;
            }
            if(flag == 0)
            {
                if(count%2==0){
                    System.out.println("User 1 wins");
                }
                else{
                    System.out.println("User 2 wins");
                }
            }
    }

    public static void main(final String args[]) {
        int user;
        
        System.out.println("------------wekcome to the flage game------------------");
        flagsgame f = new flagsgame();
        while (f.flag != 0) {
            int flag = f.flag;
            int count = f.counter;
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your number of flags you want to remove");
            user = scan.nextInt();
            f.user_move(user, f.counter); 
        }

    }
}






