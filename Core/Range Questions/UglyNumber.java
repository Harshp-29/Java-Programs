import java.util.Scanner;
class UglyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting Number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending Number: ");
        int end=sc.nextInt();

        for(int range=start ; range<=end ; range++)
        {
        int num=range;

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
            System.out.println(range+" is Ugly Number");
        }
        }
    }
}