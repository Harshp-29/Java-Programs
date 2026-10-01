import java.util.Scanner;
class SunnyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
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
        System.out.print("Sunny Number");
        }
        else{
        System.out.print("Not Sunny Number");
        }
    }
}
