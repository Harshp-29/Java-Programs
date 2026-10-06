import java.util.Scanner;
class GreatestOfThreeTernary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();

        int greatest = a > b ? (c>a ? c : a) : (c>b ? c : b) ;
        System.out.print("Greatest Of Three Ternary: "+greatest);
    }
}