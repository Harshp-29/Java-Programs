import java.util.Scanner;
class SmallestDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        int minDigit=Integer.MAX_VALUE;
        int ld=0;

        while(num>0){
            ld=num%10;
            if(ld<minDigit)
            {
                minDigit=ld;
            }
            num/=10;
        }

        System.out.print("Smallest Digit is "+minDigit);
    }
}