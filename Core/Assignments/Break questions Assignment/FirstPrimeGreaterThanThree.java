import java.util.Scanner;

class FirstPrimeGreaterThanThree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0)
        {
            int digit = num % 10;

            if((digit == 5 || digit == 7) && digit > 3)
            {
                System.out.println("First digit: " + digit);
                break;
            }

            num = num / 10;
        }
    }
}