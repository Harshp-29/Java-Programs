import java.util.Scanner;
class LowestCommonMultiple
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = a > b ? a : b;

        for(int i = lcm; ; i++)
        {
            if(i % a == 0 && i % b == 0)
            {
                System.out.println("Lowest Common Multiple: " + i);
                break;
            }
        }
    }
}