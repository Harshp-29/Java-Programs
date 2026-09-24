import java.util.Scanner;
class Strong
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();      
        int temp=num;
        int sum=0;

        while(num>0)
        {
            int ld=num%10;
            int fact=1;

            for(int i=1; i<=ld; i++)
            {
                fact=fact*i;
            }

            sum=sum+fact;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.print("It is Strong Number");
        }

        else{
            System.out.print("It is Not Strong Number");
        }
    }
}