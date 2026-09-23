import java.util.Scanner;
class FibonacciOdd
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c;

        for(int i=1 ; i<=num ; i++){
            if(a%2==1){
                System.out.print(a+ " ");
            }

            c=a+b;
            a=b;
            b=c;
        }
    }
}