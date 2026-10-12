import java.util.Scanner;
class SumOfnNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int sum=0;

        while(num>0)
        {
            int ld=num%10;
            sum = sum + ld;
            num=num/10;
        }

        System.out.print("Sum: "+sum);      
    }
}