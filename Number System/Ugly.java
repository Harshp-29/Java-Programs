import java.util.Scanner;
class Ugly
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        while(num%2==0)
        {
            num=num/2;
        }

        while(num%3==0)
        {
            num=num/3;
        }

        while(num%5==0)
        {
            num=num/5;
        }

        if(num==1)
        {
            System.out.print("Ugly Number");
        }
        else{
            System.out.print("Not Ugly Number");
        }
    }
}