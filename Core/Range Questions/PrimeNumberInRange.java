import java.util.Scanner;
class PrimeNumberInRange
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
        boolean flag=true;

        if(num==1)
        {
            flag=false;
        }

        for(int i=2 ; i<num ; i++)
        {
            if(num%i==0)
            {
                flag=false;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println(num+" zis Prime Number");
        }
        }
        
    }
}