import java.util.Scanner;

class FirstNonPrimeDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0)
        {
            int digit = num % 10;

            if(digit == 0 || digit == 1 || digit == 4 ||
               digit == 6 || digit == 8 || digit == 9)
            {
                System.out.println("First non-prime digit: " + digit);
                break;
            }

            num = num / 10;
        }
    }
}