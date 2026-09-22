import java.util.Scanner;
class BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary Number: ");
        int num=sc.nextInt();
        int ld=0;
        int decimal=0;
        int place=1;

        while(num>0){
            ld=num%10;
            decimal=decimal + ld * place;
            num=num/10;
            place=place*2;
        }

        System.out.println(decimal);
    }
}