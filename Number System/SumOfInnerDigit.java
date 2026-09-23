import java.util.Scanner;
class SumOfInnerDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int sid=0;
        int ld=0;
        num=num/10;

        while(num>9){
            ld=num%10;
            sid=sid+ld;
            num=num/10;
        }
        System.out.println("Sum of Inner Digits is: "+sid);

    }
}