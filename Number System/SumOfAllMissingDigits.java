import java.util.Scanner;
class SumOfAllMissingDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum=0;

        for(int i=0 ; i<=9 ; i++)
        {
            int ld=0;
            int temp=num;
            int count=0;

            while(temp>0)
            {
                ld=temp%10;
                if(ld==i)
                {
                    count++;
                }
                temp=temp/10;
            }
        
        if(count==0)
            {
                sum=sum+i;
            }
        }

    System.out.print("Sum Of All Missing Digits: "+sum);
    }
}