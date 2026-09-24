import java.util.Scanner;
class BaseToThePower
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int base=sc.nextInt();
        System.out.print("Enter the Power: ");
        int power=sc.nextInt();
        int res=1;

        for(int i=1 ; i<=power ; i++)
        {
            res = res * base;
        }
        System.out.println("Result: "+res);
    }
}