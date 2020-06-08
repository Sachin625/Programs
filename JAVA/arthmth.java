import java.util.*;
class arthmth
{
    int x,y,z;
    void read()
    {
        System.out.println("Enter value of x: ");
        final Scanner a = new Scanner(System.in);
        x = a.nextInt();
        System.out.println("x=" + x);
        System.out.println("Enter value of y: ");
        y = a.nextInt();
        System.out.println("y=" + y);
        a.close();

    }

    void add() {
        z = x + y;
        System.out.println("z=" + z);
    }

    public static void main(final String args[]) {
         final arthmth d = new arthmth();
        d.read();
        d.add();
    }
}