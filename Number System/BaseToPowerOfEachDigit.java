import java.util.Scanner;
class BaseToPowerOfEachDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int ld=0;
        int count=0;
        int h=num;

        while(num>0){
            count++;
            num=num/10;
        }

        num=h;

        while(num>0){
            ld = num % 10;
            int res =1;
            for(int i=1; i<=count ; i++)
            {
                res = res * ld;
            }
            System.out.println(ld+ " Res: "+res);
            num=num/10;
        }
    }
}