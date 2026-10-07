import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the Third Number: ");
        int num3 = sc.nextInt();

        if(num1 <= num2 && num1 <= num3)
        {
            System.out.print(num1 + " is Least Number");
        }
        else if(num2 <= num1 && num2 <= num3)
        {
            System.out.print(num2 + " is Least Number");
        }
        else
        {
            System.out.print(num3 + " is Least Number");
        }
    }
}