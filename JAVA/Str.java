import java.util.*;
class Str{
    String s;
    void read()
    {
    Scanner a = new Scanner (System.in);
    s=a.nextLine();
    System.out.println("s="+s);
    }
    public static void main(String args[])
    {
        Str d = new Str();
        d.read();
    }
}