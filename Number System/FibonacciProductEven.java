import java.util.Scanner;
class FibonacciProductEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        int prod=1;

        for(int i=1 ; i<=num ; i++){
            if(a%2==0 && a!=0){
                prod=prod*a;
            }
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("Product of Even Fibonacci is "+prod);
    }
}