import java.util.Scanner;

class FirstGreaterThanTwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0)
        {
            int digit = num % 10;

            if(digit > 2)
            {
                System.out.println("First digit greater than 2: " + digit);
                break;
            }

            num = num / 10;
        }
    }
}