import java.util.Scanner;
class spy
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        int prod=1;
        int ld=0;

        while(num!=0){
            ld=num%10;
            sum=sum+ld;
            prod=prod*ld;
            num=num/10;
        }

        if(prod==sum){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}