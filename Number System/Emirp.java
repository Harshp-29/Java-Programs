import java.util.Scanner;
class Emirp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int count=0;
        int temp=num;

        for(int i=1 ; i<=num ; i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        
        if(count==2)
        {
        int rev=0;
        int ld=0;

        while(num>0){
            ld=num%10;
            rev=rev*10+ld;
            num=num/10;
        }
            if(rev!=temp)
            {
                count=0;
                for(int i=1 ; i<=rev ; i++)
                {
                    if(rev%i==0)
                    {
                        count++;
                    }
                }
                if(count==2)
                {
                System.out.print("It is Emirp Number");
                }
                else{
                System.out.print("It is Not Emirp Number");
                }
            }
            else{
                System.out.print("It is Not Emirp Number");
            }

        }
        else{
        System.out.print("Invalid Number");
        }
    }
}