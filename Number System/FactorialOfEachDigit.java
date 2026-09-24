import java.util.Scanner;
class FactorialOfEachDigit
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();      

        while(num>0)
        {
            int ld=num%10;
            int fact=1;

            for(int i=1; i<=ld; i++)
            {
                fact=fact*i;
            }

            System.out.println("Factorial of " + ld + " = " + fact);

            num=num/10;
        }
    }
}