import java.util.Scanner;

class FirstDivisibleBy3And1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0)
        {
            int digit = num % 10;

            if(digit % 3 == 0 && digit % 1 == 0)
            {
                System.out.println("First digit: " + digit);
                break;
            }

            num = num / 10;
        }
    }
}