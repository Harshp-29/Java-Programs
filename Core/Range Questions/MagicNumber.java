import java.util.Scanner;
class MagicNumber
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

        while(num>9){
            int sum=0;

            while(num>0){
                ld=num%10;
                sum=sum+ld;
                num=num/10;
            }
            num=sum;
        }
        
        if(num==1)
        {
            System.out.print("Magic Number");
        }
        else{
            System.out.print("Not Magic Number");
        }
        }
    }
}
