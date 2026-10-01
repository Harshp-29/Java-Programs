import java.util.Scanner;
class PronicNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
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
            System.out.print("Pronic Number");
        }
        else{
            System.out.print("Not Pronic Number");
        }
    }
}
