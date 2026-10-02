import java.util.Scanner;
class PronicNumber
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
        boolean flag=false;

        for(int i=1 ; i<=num ; i++)
        {
            int res=i*(i+1);
            if(num==res)
            {
                flag=true;
                break;
            }
        }

        if(flag)
        {
            System.out.println(range+" is Pronic Number");
        }
        }
    }
}
