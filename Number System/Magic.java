import java.util.Scanner;
class Magic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
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
