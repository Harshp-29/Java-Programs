import java.util.Scanner;
class PrimeUsingBreak
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
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
            System.out.print("Prime Number");
        }
        else{
            System.out.print("Not Prime Number");           
        }
    }
}