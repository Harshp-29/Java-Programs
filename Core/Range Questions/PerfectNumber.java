import java.util.Scanner;
class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting Number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending Number: ");
        int end=sc.nextInt();

        for(int range=start ; range<=end ; range++)
        {
        int num=range;
        int sum=0;

        for(int i=1 ; i<=num/2 ; i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }

        if(sum==num)
        {
            System.out.println(range+" is Perfect Number");
        }
        }
    }
}