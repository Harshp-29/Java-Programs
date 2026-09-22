import java.util.Scanner;
class ProductOdd
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int prod=1;

        for(int i=1 ; i<=num ; i++)
        {
            if(num%i==0 && i%2==1)
            {
                prod=prod*i;
            }
        }
        System.out.println("Product: "+prod);
    }
}