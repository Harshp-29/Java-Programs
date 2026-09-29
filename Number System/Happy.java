import java.util.Scanner;
class Happy
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
                sum=sum+ld*ld;
                num=num/10;
            }
            num=sum;
        }

        if(num==1)
        {
            System.out.print("Happy Number");
        }
        else{
            System.out.print("Not Happy Number");
        }
    }
}