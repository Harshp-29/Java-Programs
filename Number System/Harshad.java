import java.util.Scanner;
class Harshad
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int ld=0;
        int sum=0;
        int temp=num;

        while(num!=0){
            ld=num%10;
            sum=sum+ld;
            num=num/10;
        }

        if(temp%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}