import java.util.Scanner;
class FirstUniqueDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int ld;
        int count;

        for(int i = 0; i <= 9; i++)
        {
            count = 0;
            int temp = num;

            while(temp > 0)
            {
                ld = temp % 10;

                if(ld == i)
                {
                    count++;
                }

                temp = temp / 10;
            }

            if(count == 1)
            {
                System.out.println("Unique Digit: " + i);
                break;
            }
        }
    }
}