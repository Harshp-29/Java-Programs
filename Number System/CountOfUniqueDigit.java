import java.util.Scanner;
class CountOfUniqueDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int uniqueCount=0;

        for(int i=0 ; i<=9 ; i++)
        {
            int ld=0;
            int count=0;
            int temp=num;

            while(temp>0)
                {
                    ld=temp%10;
                    if(ld==i)
                    {
                        count++;
                    }
                    temp=temp/10;
                }

            if(count==1)
            {
              uniqueCount++;  
            }
        }

    System.out.print("Unique Digit Count: "+uniqueCount);
    }
}