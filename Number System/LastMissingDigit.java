import java.util.Scanner;
class LastMissingDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int lastMissingDigit=-1;

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
        
        if(count==0)
            {
               lastMissingDigit=i;
            }
        }
        
    System.out.print("Last Missing Digit: "+lastMissingDigit);
    }
}