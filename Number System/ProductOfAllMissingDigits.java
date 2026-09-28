import java.util.Scanner;
class ProductOfAllMissingDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int prod=1;

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
                prod=prod*i;
            }
        }

    System.out.print("Product Of All Missing Digits: "+prod);
    }
}