import java.util.Scanner;
class StrongNumber
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
        int temp=num;
        int sum=0;

        while(num>0)
        {
            int ld=num%10;
            int fact=1;

            for(int i=1; i<=ld; i++)
            {
                fact=fact*i;
            }

            sum=sum+fact;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println(range+" is Strong Number");
        }
        }
    }
}