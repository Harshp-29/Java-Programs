import java.util.Scanner;
class SumOfOutterDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int sod=0;
        int ld=num%10;
        sod=sod+ld;
        num=num/10;

        while(num>9){
            num=num/10;
        }
        sod=sod+num;
        System.out.println("Sum of Outter Digits is: "+sod);

    }
}