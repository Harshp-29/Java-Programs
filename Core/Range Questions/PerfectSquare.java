import java.util.Scanner;
class PerfectSquare
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

        for(int i=1 ; i<=num ; i++)
        {
            int sq=i*i;
            if(sq==num)
            {
                flag = false;
                break;
            }
        }

        if(flag==false)
        {
            System.out.println(range+" is Perfect Square");
        }
        }
    }
}