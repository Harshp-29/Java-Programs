import java.util.Scanner;
class CountOfDigits
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
        int count = 0;

        for(int i=1 ; i<=num ; i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
    }
}