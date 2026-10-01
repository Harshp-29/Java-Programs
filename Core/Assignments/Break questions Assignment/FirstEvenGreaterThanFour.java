import java.util.Scanner;
class FirstEvenGreaterThanFour
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0)
        {
            int digit = num % 10;

            if(digit % 2 == 0 && digit > 4)
            {
                System.out.println("First digit: " + digit);
                break;
            }

            num = num / 10;
        }
    }
}