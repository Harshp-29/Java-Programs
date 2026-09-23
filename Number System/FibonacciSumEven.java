import java.util.Scanner;
class FibonacciSumEven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        int sum=0;

        for(int i=1 ; i<=num ; i++){
            if(a%2==0){
                sum=sum+a;
            }

            c=a+b;
            a=b;
            b=c;
        }

        System.out.println("Even Sum "+sum);
    }
}