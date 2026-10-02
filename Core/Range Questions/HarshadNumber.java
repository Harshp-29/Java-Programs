import java.util.Scanner;
class HarshadNumber
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
        int ld=0;
        int sum=0;
        int temp=num;

        while(num!=0){
            ld=num%10;
            sum=sum+ld;
            num=num/10;
        }

        if(temp%sum==0){
            System.out.println(range+" is Harshad Number");
        }
        }
    }
}