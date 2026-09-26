import java.util.Scanner;
class DivisibleBy5or3
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=a.nextInt();

        if(n%5==0 || n%3==0)
        {
            System.out.print("It is Divisible by 5 or 3");
        }
        else{
            System.out.print("It is Not Divisible by 5 or 3");
        }
    }
}