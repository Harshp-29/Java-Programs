import java.util.Scanner;
class SunnyNumber
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
        int res=num+1;
        boolean flag=false;

        for(int i=1 ; i<=res ; i++)
        {
            int sq=i*i;
            if(sq==res)
            {
                flag=true;
                break;
            }
        }

        if(flag==true)
        {
        System.out.println(range+" is Sunny Number");
        }
        }
    }
}
