import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int sum=0;
        int ld=0;
        int count=0;
        int temp=num;

        while(num>0){
            count++;
            num=num/10;
        }

        num=temp;

        while(num>0){
            ld = num % 10;
            int res =1;
            for(int i=1; i<=count ; i++)
            {
                res = res * ld;
            }
            sum=sum+res;
            num=num/10;
        }

        if(sum==temp)
        {
        System.out.print("It is Armstrong Number");
        }
        else{
        System.out.print("It is Not Armstrong Number");           
        }
    }
}