import java.util.Scanner;

class FirstPrimeEvenDigit1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0)
        {
            int digit = num % 10;

            if(digit == 2)
            {
                System.out.println("First prime and even digit: " + digit);
                break;
            }

            num = num / 10;
        }
    }
}