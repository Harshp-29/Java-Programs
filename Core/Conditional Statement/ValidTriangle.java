import java.util.Scanner;
class ValidTriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a=sc.nextInt();
        System.out.print("Enter the second side: ");
        int b=sc.nextInt();
        System.out.print("Enter the third side: ");
        int c=sc.nextInt();

        System.out.print((a+b)>c || (a+c)>b || (b+c)>a ? "It is Triangle" : "It is Not Triangle");

    }
}