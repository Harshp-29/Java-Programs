import java.util.Scanner;

class FirstNeitherZeroNorFive
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0)
        {
            int digit = num % 10;

            if(digit != 0 && digit != 5)
            {
                System.out.println("First digit: " + digit);
                break;
            }

            num = num / 10;
        }
    }
}