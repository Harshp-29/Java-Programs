import java.util.Scanner;
class Neon{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int sq=num*num;
        int ld=0;
        int sum=0;

        while(sq>0){
            ld=sq%10;
            sum=sum+ld;
            sq=sq/10;   
        }
        if(sum==num){
            System.out.println("It is Neon Number");
        }
        else{
            System.out.println("Not Neon Number");

        }
    }
}