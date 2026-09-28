import java.util.Scanner;
class AllMissingDigitsOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
       
        for(int i=0 ; i<=9 ; i++)
        {
            int count=0;
            int ld=0;
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
        
        if(count==0 && i%2==1) System.out.println("Odd Missing Digits: "+i);
        }
    }
}