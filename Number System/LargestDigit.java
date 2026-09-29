import java.util.Scanner;
class LargestDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        int maxDigit=Integer.MIN_VALUE;
        int ld=0;

        while(num>0){
            ld=num%10;
            if(ld>maxDigit)
            {
                maxDigit=ld;
            }
        }

        System.out.println("Largest Digit is "+maxDigit);
    }
}