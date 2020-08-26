class add_con
{
    int a,b,sum;
    add_con()
    {
        a=5;b=6;
        sum=a+b;
        System.out.println("Sum="+sum);
    }
   add_con(int c,int d)
    {
        a=c;b=d;
        sum=a+b;
        System.out.println("Sum="+sum);
    }
    public static void main(String args[])
    {
        add_con a1 = new add_con();
        add_con  a2= new add_con(3,5);
    }
}