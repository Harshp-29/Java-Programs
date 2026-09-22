import java.util.Scanner;
class CountOdd
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int count = 0;

        for(int i=1 ; i<=num ; i++)
        {
            if(num%i==0 && i%2==1)
            {
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}