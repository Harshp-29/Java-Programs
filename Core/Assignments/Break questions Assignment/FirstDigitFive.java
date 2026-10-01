import java.util.Scanner;

class FirstDigitFive
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0)
        {
            int digit = num % 10;

            if(digit == 5)
            {
                System.out.println("First digit equal to 5: " + digit);
                break;
            }

            num = num / 10;
        }
    }
}