import java.util.Scanner;
class NeonNumber
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
        int sq=num*num;
        int ld=0;
        int sum=0;

        while(sq>0){
            ld=sq%10;
            sum=sum+ld;
            sq=sq/10;   
        }
        if(sum==num){
            System.out.println(range+" is Neon Number");
        }
        }
    }
}