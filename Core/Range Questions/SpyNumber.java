import java.util.Scanner;
class SpyNumber
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
        int sum=0;
        int prod=1;
        int ld=0;

        while(num>0){
            ld=num%10;
            sum=sum+ld;
            prod=prod*ld;
            num=num/10;
        }

        if(prod==sum){
            System.out.println(range+" is Spy Number");
        }
        }
    }
}