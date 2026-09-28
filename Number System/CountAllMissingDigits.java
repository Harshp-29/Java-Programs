import java.util.Scanner;
class CountAllMissingDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int countMissingDigits = 0;

        for(int i=0 ; i<=9 ; i++)
        {
            int temp=num;
            int count=0;
            int ld=0;

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
            countMissingDigits++;
        }
        }

    System.out.println("Count of All Missing Digits: "+countMissingDigits);
    }
}