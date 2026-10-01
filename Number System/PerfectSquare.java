import java.util.Scanner;
class PerfectSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
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
            System.out.print("Perfect Square");
        }
        else{
            System.out.print("Not Perfect Square");
        }
    }
}